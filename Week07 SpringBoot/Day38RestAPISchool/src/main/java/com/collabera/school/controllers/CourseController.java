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

import com.collabera.school.models.Course;
import com.collabera.school.services.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService service;
	
	@GetMapping("/api/courses")
	public List<Course> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/api/courses/{id}")
	public Course getById(@PathVariable("id") int id) {
		return service.getById(id);
	}
	
	@GetMapping("/api/courses/department/{code}")
	public List<Course> getByDepartment(@PathVariable("code") String departmentCode) {
		return service.getByDepartment(departmentCode);
	}
	
	@PostMapping("/api/addcourse")
	public ResponseEntity<String> addCourse(@RequestBody Course course) {
		Course newCourse = service.addCourse(course.getDepartmentCode(), course.getCode());
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newCourse.getId()).toUri();
		
		return ResponseEntity.created(location).header("student", newCourse.getId() + "").body(newCourse.getDepartmentCode() + " " + newCourse.getCode());
	}
	
	@PutMapping("/api/updatecourse")
	public void updateCourse(@RequestBody Course course) {
		service.updateCourse(course);
	}
	
	@DeleteMapping("/api/deletecourse/{id}")
	public void deleteCourse(@PathVariable("id") int id) {
		service.deleteCourse(id);
	}
}
