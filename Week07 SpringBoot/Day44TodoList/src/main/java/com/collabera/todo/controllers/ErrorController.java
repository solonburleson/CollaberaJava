package com.collabera.todo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller("error")
public class ErrorController {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView errorHandler(HttpServletRequest req, Exception e) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("Exception", e.getStackTrace());
		mav.addObject("Url", req.getRequestURL());
		mav.setViewName("error");
		
		return mav;
	}
	
}
