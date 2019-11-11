package com.collabera.day20.tests;

import org.apache.log4j.Logger;

import com.collabera.day20.dao.EmployeeDao;
import com.collabera.day20.models.Employee;

public class MainTest {

	private static final Logger log = Logger.getLogger(MainTest.class.getName());
	
	public static void main(String[] args) {
		EmployeeDao empDao = new EmployeeDao();
		
		System.out.println(empDao.getAllEmployees());
		
		try {
			Employee emp = new Employee();
			emp.setId(1);
			emp.setFirstName("Solon");
			emp.setLastName("Burleson");
			emp.setDepartment(3);
			boolean success = empDao.insert(emp);
			if(success) {
				log.info("SUCCESS: INSERT employee: " + emp);
			}
		} catch(Exception e) {
			log.error(e.getMessage());
		}
		
		System.out.println(empDao.getAllEmployees());
		
		try {
			int id = 1;
			boolean count = empDao.delete(id);
			if(count) {
				log.info("SUCCESS: Delete employee: " + id);
			}
		} catch(Exception e) {
			log.error(e.getMessage());
		}
	}

}
