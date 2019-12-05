package com.collabera.school.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.collabera.school.models.Student;
import com.collabera.school.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@GetMapping("/api/students")
	public List<Student> getStudents() {
		return service.getAllStudents();
	}
	
	@GetMapping("/api/students/{id}")
	public Student findById(@PathVariable("id") int id) {
		return service.getById(id);
	}
	
	@GetMapping("/api/students/major/{major}")
	public List<Student> findByMajor(@PathVariable("major") String major) {
		return service.getByMajor(major);
	}
	
	@PostMapping("/api/addstudent")
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		Student newStudent = service.addStudent(student.getFirstName(), student.getLastName(), student.getDateOfBirth(), student.getMajor());
		
		System.out.println(newStudent);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newStudent.getId()).toUri();
		
		return ResponseEntity.created(location).header("student", newStudent.getId() + "").body(newStudent.getFirstName() + " " + newStudent.getLastName());
	}
	
	@PutMapping("/api/updatestudent")
	public void updateStudent(@RequestBody Student student) {
		service.updateStudent(student);
	}
	
	@DeleteMapping("/api/deletestudent/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		service.deleteStudent(id);
	}
}
