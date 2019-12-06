package com.collabera.day39.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.day39.models.Address;
import com.collabera.day39.repositories.AddressRepository;

@RestController
public class AddressController {
	@Autowired
	AddressRepository service;
	
	@GetMapping("/api/addresses")
	public List<Address> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/api/address/{id}")
	public Address getById(@PathVariable("id") Long id) {
		Optional<Address> found = service.findById(id);
		
		if(found.isPresent()) {
			return found.get();
		} else {
			return new Address();
		}
	}
	
	@PostMapping("/api/addaddress")
	public void addAddress(@RequestBody Address address) {
		service.save(address);
	}
}
