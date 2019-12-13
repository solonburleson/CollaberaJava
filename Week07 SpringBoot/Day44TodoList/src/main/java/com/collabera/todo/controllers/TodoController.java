package com.collabera.todo.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.collabera.todo.models.Todo;
import com.collabera.todo.services.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value = "/listtodos", method = RequestMethod.GET)
	public String getAllTodos(ModelMap model) {
		String name = (String) model.get("name");
		
		model.put("userName", name);
		model.put("todos", service.findByUser(name));
		
		return "listtodos";
	}
	
	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public String getAddTodo(ModelMap model) {
		
		return "todo";
	}
	
	@RequestMapping(value = "/todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @RequestParam String desc) {
		
		String name = (String) model.get("name");
		service.addTodo(desc, name, new Date(), false);
		
		return "redirect:/listtodos";
	}
	
	@RequestMapping(value = "/deletetodo", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int id) {
		
		Todo todo = service.deleteTodo(id);
		
		return "redirect:/listtodos";
	}
}
