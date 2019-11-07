package com.collabera.day19.dao;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.collabera.day19.models.City;

public class CityDao {
	private static final Logger logger = Logger.getLogger(CityDao.class.getName()); // log4J
//	private static final CountryDao countryDao;
	private static HashMap<Integer,City> cache = new HashMap<Integer,City>();

	/** retrieve a city by its id */
	public City findById( Integer id ) {
		if (cache.containsKey(id)) return cache.get(id);
		List<City> list = find("WHERE id = "+id);
		return list.get(0);
	}

	/** retrieve a city by name */
	public List<City> findByName( String name ) {
//		name = sanitize(name);
		List<City> list = find("WHERE name = '"+name+"'");
		return list;
	}
	
	/** find cities using a general query, use a

	* WHERE ..., HAVING ..., or other selection clause */
	public List<City> find( String query ) {
		List<City> list = new ArrayList<City>();
		
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("jdbc.properties"));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String dburl = props.getProperty("dburl");
		String username = props.getProperty("username");
		String password = props.getProperty("password");
		Statement stmt = null;
		
		try {
			stmt = DriverManager.getConnection(dburl, username, password).createStatement();
		} catch(SQLException e) {
			
		}
		String sqlquery = "SELECT * FROM cities c " + query;
	
		try {
			logger.debug("executing query: " + sqlquery );
			ResultSet rs = stmt .executeQuery( sqlquery );
			while (rs.next()) {
				City c = resultSetToCity(rs);
				list.add( c );
			}
		} catch (SQLException sqle) {
			logger.error( "error executing: "+sqlquery, sqle);
		} finally {
			if (stmt!=null) try { stmt.close(); }
			catch(SQLException e) { /* ignore it */ }
		}
		return list;
	}
	
	private City resultSetToCity(ResultSet rs) throws SQLException {
		City city = null;
		Integer id = rs.getInt("id");

		// is this city already in cache? if so, use it

		if (cache.containsKey(id)) city = cache.get(id);
		else city = new City();
		city.setId(id);
		city.setName(rs.getString("Name"));
		city.setDistrict(rs.getString("District"));
		city.setPopulation(rs.getInt("Population"));
		city.setCountryCode(rs.getString("country_code"));
		if (!cache.containsKey(id)) cache.put(id, city);
		// now get reference to the country this city refers
		logger.info("get country for city " + city.getName());
//		Country country = countryDao.findById(countrycode);
//		city.setCountry(country);
		return city;
	}
}
