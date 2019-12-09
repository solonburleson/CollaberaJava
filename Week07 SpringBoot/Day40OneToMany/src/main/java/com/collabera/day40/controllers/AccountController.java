package com.collabera.day40.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.day40.models.Account;
import com.collabera.day40.repositories.AccountRepository;

@RestController
public class AccountController {
	@Autowired
	AccountRepository service;
	
	@GetMapping("/api/accounts")
	public List<Account> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/api/account/{id}")
	public Account getById(@PathVariable("id") Long id) {
		Optional<Account> found = service.findById(id);
		
		if(found.isPresent()) {
			return found.get();
		} else {
			return new Account();
		}
	}
}
