package com.collabera.todo.services;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.collabera.todo.dao.TodoDao;
import com.collabera.todo.models.Todo;

@Primary
@Service
public class TodoServiceRDBMS implements TodoServiceI {
	
	@Autowired
	TodoDao dao;
	
	public List<Todo> findAll() {
		return null;
	}
	
	public List<Todo> findByUser(String user) {
		return dao.getTodosForUser(user);
	}
	
	public Todo findById(int id) {
		return dao.getTodoById(id);
	}
	
	public Todo addTodo(Todo todo) {
		return null;
	}
	
	public Todo addTodo(String desc, String user, Date targetDate, boolean status) {
		
		try {
			Todo todo = dao.insertTodo(desc, user, targetDate, status);
			return todo;
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		
		return null;
	}
	
	public Todo editTodo(Todo todo) {
//		todos.stream().filter(t -> t.getId() == todo.getId()).forEach(t -> t = todo);
//		return null;
		return dao.editTodo(todo);
	}
	
	public Todo deleteTodo(int id) {
		return dao.deleteTodoById(id);
	}
}
