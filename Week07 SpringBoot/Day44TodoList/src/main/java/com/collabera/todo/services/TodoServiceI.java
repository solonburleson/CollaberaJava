package com.collabera.todo.services;

import java.util.Date;
import java.util.List;

import com.collabera.todo.models.Todo;

public interface TodoServiceI {
	public List<Todo> findAll();
	
	public List<Todo> findByUser(String user);
	
	public Todo findById(int id);
	
	public Todo addTodo(Todo todo);
	
	public Todo addTodo(String desc, String user, Date targetDate, boolean status);
	
	public Todo editTodo(Todo todo);
	
	public Todo deleteTodo(int id);
}
