package com.collabera.day39.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.day39.models.Student;
import com.collabera.day39.repositories.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository service;
	
	@GetMapping("/api/students")
	public List<Student> getStudents() {
		return service.findAll();
	}
	
	@GetMapping("/api/student/{id}")
	public Student getById(@PathVariable("id") Long id) {
		Optional<Student> optStudent = service.findById(id);
		
		if(optStudent.isPresent()) {
			return optStudent.get();
		}
		
		return new Student();
	}
	
	@PostMapping("/api/addstudent")
	public void addStudent(@RequestBody Student newStudent) {
		service.save(newStudent);
		System.out.println("Added: " + newStudent);
	}
	
	@PutMapping("/api/updatestudent")
	public @ResponseBody String updateStudent(@RequestBody Student student) {
		Optional<Student> found = service.findById(student.getId());
		
		if(found.isPresent()) {
			service.save(student);
			return "Saved: " + student.toString();
		} else {
			return "Could not update student with id: " + student.getId();
		}
	}
	
	@DeleteMapping("/api/removestudent/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		
		if(id == 1L) {
			return ResponseEntity.status(400).body("Can't delete the admin");
		} else {
			service.deleteById(id);
			return ResponseEntity.status(200).body("Deleted student.");
		}
		
	}
}
