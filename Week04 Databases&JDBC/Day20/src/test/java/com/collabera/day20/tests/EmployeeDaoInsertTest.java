package com.collabera.day20.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.collabera.day20.dao.EmployeeDao;
import com.collabera.day20.models.Employee;

public class EmployeeDaoInsertTest {
	@Test
	public void insertTest() {
		EmployeeDao empDao = new EmployeeDao();
		boolean inserted = false;
		try {
			inserted = empDao.insert(new Employee(46, "Jon6", "Snow6", 1));
		} catch(Exception e) {
			e.printStackTrace();
		}
		assertTrue(inserted);
	}
}
