package com.collabera.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.collabera.todo.models.Todo;

@Component
public class TodoDao {
	
	@Autowired
	ConnectionManager connMgr;
	
	Connection conn = null;
	
	public Todo insertTodo(String desc, String user, Date targetDate, boolean status) throws SQLException {		
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = connMgr.getConn();
			pstmt = conn.prepareStatement("INSERT INTO todos(description, username, target_date, status) VALUES(?, ?, ?, ?)",PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, desc);
			pstmt.setString(2, user);
			java.sql.Date sqlDate = new java.sql.Date(targetDate.getTime());		
			pstmt.setDate(3, sqlDate);
			pstmt.setBoolean(4, status);
			
			int result = pstmt.executeUpdate();
			
			rs = pstmt.getGeneratedKeys();
			int id = 0;
			while(rs.next()) {
				id = (int) rs.getInt(1);
			}
			
			if(result > 0) {
				return new Todo(id, desc, user, targetDate, status);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(pstmt != null) {
				pstmt.close();
			}
		}
		
		return null;
	}
	
	public Todo getTodoById(int id) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Todo todo = null;
		
		try {
			conn = connMgr.getConn();
			pstmt = conn.prepareStatement("SELECT * FROM todos WHERE id = ?");
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				todo = resultSetToTodo(rs);
			}			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch(SQLException sqle) {
					sqle.printStackTrace();
				}
			}
		}
		
		return todo;
	}
	
	public List<Todo> getTodosForUser(String username) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<Todo> todos = new ArrayList<Todo>();
		
		try {
			conn = connMgr.getConn();
			pstmt = conn.prepareStatement("SELECT * FROM todos WHERE username = ?");
			pstmt.setString(1, username);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Todo todo = resultSetToTodo(rs);
				todos.add(todo);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch(SQLException sqle) {
					
				}
			}
		}
		
		return todos;
	}
	
	public Todo editTodo(Todo todo) {
		PreparedStatement pstmt = null;
		Todo editTodo = null;

		
		try {
			conn = connMgr.getConn();
			pstmt = conn.prepareStatement("UPDATE todos SET description = ?, username = ?, target_date = ?, status = ? WHERE id = ?;");
			pstmt.setString(1, todo.getDesc());
			pstmt.setString(2, todo.getUser());
			java.sql.Date sqlDate = new java.sql.Date(todo.getTargetDate().getTime());
			pstmt.setDate(3, sqlDate);
			pstmt.setBoolean(4, todo.isStatus());
			pstmt.setInt(5, todo.getId());
			
			pstmt.executeUpdate();
			
			editTodo = getTodoById(todo.getId());
			
		} catch(Exception e) {
			
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch(SQLException sqle) {
					
				}
			}
		}
		
		return editTodo;
	}
	
	public Todo deleteTodoById(int id) {
		Todo todo = getTodoById(id);
		
		PreparedStatement pstmt = null;
		
		try {
			conn = connMgr.getConn();
			pstmt = conn.prepareStatement("DELETE FROM todos WHERE id = ?");
			pstmt.setInt(1, id);
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch(SQLException sqle) {
					
				}
			}
		}
		
		return todo;
	}
	
	public Todo resultSetToTodo(ResultSet rs) throws SQLException {
		Todo todo = new Todo();
		
		todo.setId(rs.getInt("id"));
		todo.setDesc(rs.getString("description"));
		todo.setUser(rs.getString("username"));
		todo.setTargetDate(rs.getDate("target_date"));
		todo.setStatus(rs.getBoolean("status"));
		
		return todo;
	}
}
