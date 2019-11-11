package com.collabera.day19.connection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.collabera.day19.dao.CityDao;

public class ConnectionManager {
	private static final Logger logger = Logger.getLogger(ConnectionManager.class.getName()); // log4J
	
	public Connection getConnection() {
		Connection conn = null;
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("jdbc.properties"));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String dburl = prop.getProperty("dburl");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		try {
			conn = DriverManager.getConnection(dburl, username, password);
		} catch(SQLException sqle) {
			logger.error(sqle);
		}
		
		return conn;
	}
}
