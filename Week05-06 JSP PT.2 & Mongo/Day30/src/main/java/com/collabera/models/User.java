package com.collabera.models;

import org.bson.types.ObjectId;

public class User {
	private ObjectId id;
	private String username;
	private String password;
	
	public User() {
		super();
	}
	
	public User(String username, String password) {
		this(new ObjectId(), username, password);
	}
	
	public User(ObjectId id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User[username=" + username + ",password=" + password + "]";
	}
}
