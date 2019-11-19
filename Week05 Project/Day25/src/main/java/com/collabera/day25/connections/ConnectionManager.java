package com.collabera.day25.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	public Connection getConnection() {
		Connection conn = null;
		
		String dburl = "jdbc:mysql://localhost:3306/week5";
		String username = "root";
		String password = "root";
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection(dburl, username, password);
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		
		return conn;
	}
}

