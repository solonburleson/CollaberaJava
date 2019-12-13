package com.collabera.day42.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.collabera.day42.services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value = "/login")
	// return string
//	@ResponseBody
	public String login(@RequestParam(defaultValue="guest") String name, ModelMap model) {
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
