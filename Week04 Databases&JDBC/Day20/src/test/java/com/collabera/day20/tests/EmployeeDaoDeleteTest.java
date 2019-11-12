package com.collabera.day20.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.collabera.day20.dao.EmployeeDao;

public class EmployeeDaoDeleteTest {
	@Test
	public void testDelete() {
		boolean deleted = false;
		EmployeeDao empDao = new EmployeeDao();
		try {
			deleted = empDao.delete(46);
		} catch(Exception e) {
			e.printStackTrace();
		}
		assertTrue(deleted);
	}
}
