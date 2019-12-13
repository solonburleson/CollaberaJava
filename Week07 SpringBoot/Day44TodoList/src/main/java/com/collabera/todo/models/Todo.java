package com.collabera.todo.models;

import java.util.Date;

public class Todo {
	
	private int id;
	private String desc;
	private String user;
	private Date targetDate;
	private boolean status;
	
	public Todo(int id, String desc, String user, Date targetDate, boolean status) {
		super();
		this.id = id;
		this.desc = desc;
		this.user = user;
		this.targetDate = targetDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", desc=" + desc + ", user=" + user + ", targetDate=" + targetDate + ", status="
				+ status + "]";
	}
}
