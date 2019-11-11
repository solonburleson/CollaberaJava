package com.collabera.day20.models;

enum Department{ACCOUNTING,HR,DEVELOPMENT,SALES}

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private Department department;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String fname, String lname, Department department) {
		super();
		this.id = id;
		this.firstName = fname;
		this.lastName = lname;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Department getDepartment() {
		return department;
	}

	public Integer getDepartmentId() {
		Integer idx = null;
		Department[] items = Department.values();
		for(int i = 0; i < items.length; i++) {
			if(items[i] == department) {
				idx = ++i;
			}
		}
		return idx;
	}
	
	public void setDepartment(int depart_id) {
		Department[] items = Department.values();
		this.department = items[--depart_id];
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + "]";
	}
}
