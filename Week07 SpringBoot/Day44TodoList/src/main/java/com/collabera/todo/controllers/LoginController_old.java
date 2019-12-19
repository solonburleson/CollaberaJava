package com.collabera.todo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.collabera.todo.services.LoginService;


@SessionAttributes("name")
public class LoginController_old {
	@Autowired
	LoginService service;
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validateLogin(@RequestParam(defaultValue="guest") String name, @RequestParam("password") String password, ModelMap model) {
		System.out.println(name);
		
		if(service.validateLogin(name, password)) {
			model.put("password", password);
			model.put("name", name);
			
			return "welcome";
		} else {
			return "redirect:/login";
		}
	}
}
