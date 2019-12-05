package com.collabera.models;

import org.bson.types.ObjectId;

public class Employee {
	private ObjectId id;
	private String firstName;
	private String lastName;
	private int age;
	
	public Employee() {
		super();
	}
	
	public Employee(String fname, String lname, int age) {
		this(new ObjectId(),fname,lname,age);
	}
	
	public Employee(ObjectId id, String fname, String lname, int age) {
		this.id = id;
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ",firstName=" + firstName + ",lastName=" + lastName + ",age=" + age + "]";
	}
}
