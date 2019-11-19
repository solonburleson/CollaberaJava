package com.collabera.models;

public class LoginBean {
	private String name;
	private String password;
	
	public LoginBean() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validate() {
		if(password.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}
}
