package com.collabera.todo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.collabera.todo.models.User;

public class UserDao {
	
	@Autowired
	ConnectionManager connMgr;

	public User getUserByUserName(String username) {
		User user = new User();
		
		return user;
	}
	
	public User resultSetToUser(ResultSet rs) throws SQLException {
		User user = new User();
		
		user.setId(rs.getInt("id"));
		user.setUserName(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setFullName(rs.getString("full_name"));
		user.setRoles(rs.getString("roles"));
		
		return user;
	}
}
