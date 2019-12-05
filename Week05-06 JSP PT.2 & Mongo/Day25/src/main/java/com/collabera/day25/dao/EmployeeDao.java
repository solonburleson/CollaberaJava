package com.collabera.day25.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.collabera.day25.connections.ConnectionManager;
import com.collabera.day25.models.Employee;

public class EmployeeDao {
	static ConnectionManager conn = new ConnectionManager();
	private static HashMap<Integer,Employee> cache = new HashMap<Integer,Employee>();
	
	public Employee getById(int id) {
		List<Employee> empList = new ArrayList<Employee>();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.getConnection().prepareStatement("SELECT * FROM employees WHERE id = ?");
			stmt.setInt(1, id);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Employee e = resultSetToEmployee(rs);
				empList.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return empList.get(0);
	}
	
	public List<Employee> getList(int pageNum, int pageSize){
		List<Employee> empList = new ArrayList<Employee>();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.getConnection().prepareStatement("SELECT * FROM employees LIMIT ? OFFSET ?");
			stmt.setInt(1, pageSize);
			stmt.setInt(2, (pageNum - 1) * pageSize);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Employee e = resultSetToEmployee(rs);
				empList.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return empList;
	}
	
	public List<Employee> getAll() {
		List<Employee> empList = new ArrayList<Employee>();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.getConnection().prepareStatement("SELECT * FROM employees");
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Employee e = resultSetToEmployee(rs);
				empList.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return empList;
	}
	
	public Employee insert(Employee e) {
		PreparedStatement stmt = null;
		try {
			if(e.getId() > 0) {
				stmt = conn.getConnection().prepareStatement("UPDATE employees SET firstName = ?, lastName = ? WHERE id = ?");
				stmt.setString(1, e.getFirstName());
				stmt.setString(2, e.getLastName());
				stmt.setInt(3, e.getId());
			} else {
				stmt = conn.getConnection().prepareStatement("INSERT INTO employees(firstName,lastName) VALUES (?, ?)");
				stmt.setString(1, e.getFirstName());
				stmt.setString(2, e.getLastName());
			}
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		
		try {
			stmt.executeUpdate();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		Employee emp;
		
		if(e.getId() > 0) {
			emp = getById(e.getId());
		} else {
			emp = getLastEntry();
		}
		
		return emp;
	}
	
	public void delete(int id) {
		List<Employee> empList = new ArrayList<Employee>();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.getConnection().prepareStatement("DELETE FROM employees WHERE id = ?");
			stmt.setInt(1, id);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getTotalRecords() {
		int total = 0;
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.getConnection().prepareStatement("SELECT COUNT(*) from employees");
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		
		try {
			ResultSet rs = stmt.executeQuery();
			rs.next();
			total = rs.getInt("COUNT(*)");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return total;
	}
	
	private Employee getLastEntry() {
		List<Employee> empList = new ArrayList<Employee>();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.getConnection().prepareStatement("SELECT * FROM employees ORDER BY id DESC LIMIT 1");
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Employee e = resultSetToEmployee(rs);
				empList.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return empList.get(0);
	}
	
	private Employee resultSetToEmployee(ResultSet rs) throws SQLException {
		Employee emp = null;
		int id = rs.getInt("id");

		// is this city already in cache? if so, use it

		if (cache.containsKey(id)) emp = cache.get(id);
		else emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setFirstName(rs.getString("firstName"));
		emp.setLastName(rs.getString("lastName"));
		if (!cache.containsKey(id)) cache.put(id, emp);
		// now get reference to the country this city refers
		return emp;
	} 
}
