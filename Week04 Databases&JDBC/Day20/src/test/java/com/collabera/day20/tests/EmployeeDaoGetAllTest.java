package com.collabera.day20.tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.collabera.day20.dao.EmployeeDao;
import com.collabera.day20.models.Employee;


public class EmployeeDaoGetAllTest {
	@Test
	public void testGetAllEmployees() {
		EmployeeDao empDao = new EmployeeDao();
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			list = empDao.getAllEmployees();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for(Employee e: list) {
			System.out.println(e);
		}
		System.out.println("-----------------------");
		assertTrue(list.size() > 0);
	}
}
