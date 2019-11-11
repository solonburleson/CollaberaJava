package com.collabera.day20.connections;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConnectionManager {
	private static final Logger logger = Logger.getLogger(ConnectionManager.class.getName()); // log4J
	
	public Connection getConnection() {
		Connection conn = null;
		
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("jdbc.properties"));
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
		
		String dburl = props.getProperty("dburl");
		String username = props.getProperty("username");
		String password = props.getProperty("password");
		
		try {
			conn = DriverManager.getConnection(dburl, username, password);
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
		
		return conn;
	}
}
