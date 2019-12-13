package com.collabera.day42.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateLogin(String name, String password) {
		if(password.equals("admin123")) {
			return true;
		}
		return false;
	}
}
