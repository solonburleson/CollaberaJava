package com.collabera.day24JSP.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.collabera.day24JSP.models.Employee;

public class EmployeeDao {
	static Map<Integer, Employee> employeeMap = new TreeMap<Integer, Employee>();
	static {
		for(int i = 0; i < 20; i++) {
			employeeMap.put(i, new Employee(i, "First" + i, "Last" + i));
			System.out.println("employeeMap size: " + employeeMap.size());
		}
	}
	
	public static List<Employee> getList() {
		return new ArrayList<Employee>(employeeMap.values());
	}
	
	public List<Employee> getList(int pageNum, int pageSize) {
		ArrayList<Employee> shortList = new ArrayList<Employee>();
		int count = 0;
		
		for(Employee e : getList()) {
			if(count >= (pageNum - 1) * pageSize && count < ((pageNum - 1) * pageSize) + pageSize)  {
				shortList.add(e);
			}
			count++;
		}
		
		return shortList;
	}
	
	public static boolean insert(Employee emp) {
		boolean ret = false;
		
		if(!employeeMap.containsKey(emp.getId())) {
			employeeMap.put(emp.getId(), emp);
			ret = true;
		}
		return ret;
	}
	
	public static boolean delete(Employee emp) {
		boolean ret = false;
		
		if(employeeMap.containsKey(emp.getId())) {
			employeeMap.remove(emp.getId());
			ret = true;
		}
		
		return ret;
	}
}
