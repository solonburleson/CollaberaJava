package com.collabera.day39.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.day39.models.Person;
import com.collabera.day39.repositories.PersonRepository;

@RestController
public class PersonController {
	@Autowired
	PersonRepository service;
	
	@GetMapping("/api/persons")
	public List<Person> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/api/person/{id}")
	public Person getPerson(@PathVariable("id") Long id) {
		Optional<Person> optPerson = service.findById(id);
		
		if(optPerson.isPresent()) {
			return optPerson.get();
		} else {
			return new Person();
		}
	}
	
	@PostMapping("/api/addperson")
	public void addPerson(@RequestBody Person person) {
		service.save(person);
	}
	
	@PutMapping("/api/updateperson")
	public void updatePerson(@RequestBody Person person) {
		
	}
	
	@DeleteMapping("/api/removeperson/{id}")
	public void deletePerson(@PathVariable("id") Long id) {
		
	}
}
