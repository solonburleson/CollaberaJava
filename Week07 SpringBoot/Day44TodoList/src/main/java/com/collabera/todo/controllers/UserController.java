package com.collabera.todo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.collabera.todo.models.User;
import com.collabera.todo.services.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String allUsers(ModelMap model) {
		model.put("users", service.findAllUsers());
		
		return "users";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getAddUser(ModelMap model) {
		User user = new User();
		model.put("user", user);
		return "user";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String addUser(ModelMap model, @Valid User user, BindingResult result) {
		if(result.hasErrors()) {
			return "user";
		}
		
		service.addUser(user.getUserName(), user.getPassword(), user.getFullName(), user.getRoles());
		
		return "redirect:/users";
	}
	
	@RequestMapping(value = "/edituser", method = RequestMethod.GET)
	public String getUpdateUser(@RequestParam int id, ModelMap model) {
		User user = service.findById(id);
		
		model.put("user", user);
		
		return "user";
	}
	
	@RequestMapping(value = "/edituser", method = RequestMethod.POST)
	public String updateUser(ModelMap model, @Valid User user, BindingResult result) {
		if(result.hasErrors()) {
			return "user";
		}
		
		service.editUser(user);
		
		return "redirect:/users";
	}
	
	@RequestMapping(value = "/deleteuser", method = RequestMethod.GET)
	public String deleteUser(@RequestParam int id) {
		service.deleteUser(id);
		
		return "redirect:/users";
	}
}
