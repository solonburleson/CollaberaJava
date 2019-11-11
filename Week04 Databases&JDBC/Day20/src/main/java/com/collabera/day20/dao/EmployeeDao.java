package com.collabera.day20.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;

import com.collabera.day20.connections.ConnectionManager;
import com.collabera.day20.models.Employee;

public class EmployeeDao {
	ConnectionManager conn = new ConnectionManager();
	private static final Logger logger = Logger.getLogger(EmployeeDao.class.getName()); // log4J
	private static HashMap<Integer,Employee> cache = new HashMap<Integer,Employee>();
	
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.getConnection().prepareStatement("SELECT * FROM employees");
		} catch(SQLException sqle) {
			logger.error(sqle.getMessage());
		}
		
		try {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee e = resultSetToEmployee(rs);
				list.add(e);
			}
		} catch(SQLException sqle) {
			logger.error(sqle.getMessage());
		}
		
		return list;
	}
	
	public boolean insert(Employee e) {
		Integer id = e.getId();
		
		if(id == null) {
			return false;
		}
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.getConnection().prepareStatement("INSERT INTO employees VALUES(?, ?, ?, ?)");
			pstmt.setInt(1, e.getId());
			pstmt.setString(2, e.getLastName());
			pstmt.setString(3, e.getFirstName());
			pstmt.setInt(4, e.getDepartmentId());
		} catch(SQLException sqle) {
			logger.error(sqle.getMessage());
		}
		
		int count = 0;
		try {
			count = pstmt.executeUpdate();
		} catch(SQLException sqle) {
			logger.error(sqle.getMessage());
		} finally {
			try {
				pstmt.close();
			} catch(SQLException sqle) {
				logger.error(sqle.getMessage());
			}
		}
		
		return count > 0;
	}
	
	public boolean delete(Integer id) {
		if(id == null) {
			return false;
		}
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.getConnection().prepareStatement("DELETE FROM employees WHERE employee_id = ?");
			stmt.setInt(1, id);
		} catch(SQLException sqle) {
			logger.error(sqle.getMessage());
		}
		
		int count = 0;
		try {
			count = stmt.executeUpdate();
		} catch(SQLException sqle) {
			logger.error(sqle.getMessage());
		} finally {
			try {
				stmt.close();
			} catch(SQLException sqle) {
				logger.error(sqle.getMessage());
			}
		}
		
		return count > 0;
	}
	
	
	public Employee resultSetToEmployee(ResultSet rs) throws SQLException {
		Employee emp = null;
		int id = rs.getInt("employee_id");
		
		if(cache.containsKey(id)) {
			emp = cache.get(id);
		} else {
			emp = new Employee();
		}
		emp.setId(id);
		emp.setFirstName(rs.getString("firstName"));
		emp.setLastName(rs.getString("lastName"));
		emp.setDepartment(rs.getInt("department_id"));
		
		if(!cache.containsKey(id)) {
			cache.put(id, emp);
		}
		
		return emp;
	}
}