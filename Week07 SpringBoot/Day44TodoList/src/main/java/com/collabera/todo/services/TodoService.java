package com.collabera.todo.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.collabera.todo.models.Todo;

@Service
public class TodoService implements TodoServiceI {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int IDCounter = 1;
	
	static {
		todos.add(new Todo(IDCounter++, "Shopping", "Solon", new Date(), true));
		todos.add(new Todo(IDCounter++, "Study", "Solon", new Date(), false));
		todos.add(new Todo(IDCounter++, "Run", "Solon", new Date(), false));
		todos.add(new Todo(IDCounter++, "Run", "Ann", new Date(), false));
	}
	
	public List<Todo> findAll() {
		return todos;
	}
	
	public List<Todo> findByUser(String user) {
		List<Todo> userTodos = todos.stream().filter(t -> t.getUser().equals(user)).collect(Collectors.toCollection(ArrayList::new));
		return userTodos;
	}
	
	public Todo findById(int id) {
		Todo thisTodo = todos.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
		return thisTodo;
	}
	
	public Todo addTodo(Todo todo) {
		todos.add(todo);
		return todo;
	}
	
	public Todo addTodo(String desc, String user, Date targetDate, boolean status) {
		Todo todo = new Todo(IDCounter++, desc, user, targetDate, status);
		
		todos.add(todo);
		return todo;
	}
	
	public Todo editTodo(Todo todo) {
//		todos.stream().filter(t -> t.getId() == todo.getId()).forEach(t -> t = todo);
		deleteTodo(todo.getId());
		todos.add(todo);
		return todo;
	}
	
	public Todo deleteTodo(int id) {
		Todo todo = todos.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
		todos.remove(todo);
		return todo;
	}
}
