package com.collabera.todo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class ConnectionManager {
	String connectionString = "jdbc:mysql://localhost:3306/todojdbc";
	String userName = "root";
	String password = "root";
	
	Connection conn;

	public ConnectionManager() {
		super();
		try {
			conn = DriverManager.getConnection(connectionString, userName, password);
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}	
}
