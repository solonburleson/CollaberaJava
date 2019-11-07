package com.collabera.day19.test;

import java.util.List;

import org.apache.log4j.Logger;

import com.collabera.day19.dao.CityDao;
import com.collabera.day19.dao.CountryDao;
import com.collabera.day19.models.City;
import com.collabera.day19.models.Country;


public class DaoTest {
	
	private static final Logger log = Logger.getLogger(DaoTest.class.getName());
	public static void main(String[] args) {
		log.info("Testing CityDao...");
		CityDao cityDao = new CityDao();
		try {
			List<City> cities = cityDao.findByName("Miami");
			if(cities.size() > 0) {
				log.info(cities.get(0));
			}
		} catch(Exception e) {
			log.error(e.getMessage());
		}
		
		log.info("Testing CountryDao...");
		CountryDao countryDao = new CountryDao();
		try {
			List<Country> countries = countryDao.findByName("Congo");
			if(countries.size() > 0) {
				log.info(countries.get(0));
			}
		} catch(Exception e) {
			log.error(e.getMessage());
		}
	}
}
