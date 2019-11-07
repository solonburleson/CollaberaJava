package com.collabera.day19.dao;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.collabera.day19.models.Country;

public class CountryDao {
	private static final Logger logger = Logger.getLogger(CityDao.class.getName()); // log4J
	private static HashMap<String,Country> cache = new HashMap<String,Country>();
	
	public List<Country> findByName(String name) {
		List<Country> list = find(name);
		return list;
	}
	
	//public List<Country> find(String query) {
	public List<Country> find(String parameter) {
		List<Country> countries = new ArrayList<Country>();
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("jdbc.properties"));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String dburl = prop.getProperty("dburl");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
//			stmt = DriverManager.getConnection(dburl, username, password).createStatement();
			pstmt = DriverManager.getConnection(dburl, username, password).prepareStatement("SELECT * FROM countries WHERE name = ?");
			pstmt.setString(1, parameter);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
//		String sqlquery = "SELECT * FROM countries c " + query;
		
		try {
//			logger.debug("executing query: " + sqlquery);
//			ResultSet rs = stmt.executeQuery(sqlquery);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Country c = resultSetToCountry(rs);
				countries.add(c);
			}
		} catch(SQLException sqle) {
//			logger.error( "error executing: "+sqlquery, sqle);
		} finally {
			if (pstmt!=null) try { pstmt.close(); }
			catch(SQLException e) { /* ignore it */ }
		}
		return countries;
	}
	
	private Country resultSetToCountry(ResultSet rs) throws SQLException {
		Country country = null;
		String code = rs.getString("Code");

		// is this city already in cache? if so, use it

		if (cache.containsKey(code)) country = cache.get(code);
		else country = new Country();
		country.setCode(rs.getString("Code"));
		country.setName(rs.getString("Name"));
		country.setContinent(rs.getString("Continent"));
		country.setRegion(rs.getString("Region"));
		country.setPopulation(rs.getInt("Population"));
		if (!cache.containsKey(code)) cache.put(code, country);
		// now get reference to the country this city refers
		logger.info("get country for city " + country.getName());
		return country;
	} 
}
