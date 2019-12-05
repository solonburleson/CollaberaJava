package com.collabera.school.models;

public class Course {
	private int id;
	private String departmentCode;
	private String code;
	
	public Course() {
		this(-1, "N/A", "N/A");
	}
	
	public Course(int id, String departmentCode, String code) {
		super();
		this.id = id;
		this.departmentCode = departmentCode;
		this.code = code;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartmentCode() {
		return departmentCode;
	}
	
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", departmentCode=" + departmentCode + ", code=" + code + "]";
	}	
}
