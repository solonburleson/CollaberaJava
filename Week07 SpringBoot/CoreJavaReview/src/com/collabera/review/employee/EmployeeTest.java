package com.collabera.review.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
        
        employees.add(new Employee("Josiah", 90000, "Engineer"));
        employees.add(new Employee("Matt", 100000, "Engineer"));
        employees.add(new Employee("Abe", 250000, "Engineer"));
        employees.add(new Employee("Terry", 250001, "Database Arch"));
        employees.add(new Employee("Roy", 2500000, "CEO"));
        employees.add(new Employee("Brian", 70000, "Dev"));
        employees.add(new Employee("Danny", Integer.MAX_VALUE, "Juggling"));
        employees.add(new Employee("Dan", 3000000, "Management"));
        employees.add(new Employee("Lee", 0, "Intern"));
        employees.add(new Employee("Terri", 350000, "Dev"));
        employees.add(new Employee("Stanley", 75000, "Dev"));
        employees.add(new Employee("Donny", 85000, "Mobile Eng"));
        employees.add(new Employee("Rebecca", 650000, "Finances"));
        
        List<Employee> min = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)).limit(2).collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println(min);
        
        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
       
        System.out.println(spy_game(new int[] {1,2,4,0,0,7,5})); //--> True
        System.out.println(spy_game(new int[] {1,0,2,4,0,5,7})); //--> True
        System.out.println(spy_game(new int[] {1,7,2,0,4,5,0})); //--> False
	}
	
	public static boolean spy_game(int[] arr) {
		String strArr = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0 || arr[i] == 7) {
				strArr += arr[i];
			}
		}
		
		if(strArr.contains("007")) {
			return true;
		}
		
		return false;
	}

}
