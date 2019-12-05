package com.collabera.school.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.collabera.school.models.Course;

@Service
public class CourseService {
	private static List<Course> courses = new ArrayList<Course>();
	private static int idCounter = 1;
	
	static {
		courses.add(new Course(idCounter++, "GEO", "1301"));
		courses.add(new Course(idCounter++, "CS", "3305"));
		courses.add(new Course(idCounter++, "BIO", "5303"));
	}
	
	public List<Course> getAll() {
		return courses;
	}
	
	public Course getById(int id) {
		Course course = new Course();
		
		for(int i = 0; i < courses.size(); i++) {
			if(courses.get(i).getId() == id) {
				course = courses.get(i);
				break;
			}
		}
		
		return course;
	}
	
	public List<Course> getByDepartment(String departmentCode) {
		return courses.stream().filter(c -> c.getDepartmentCode().toLowerCase().equals(departmentCode.toLowerCase())).collect(Collectors.toList());
	}
	
	public Course addCourse(String departmentCode, String code) {
		Course course = new Course(idCounter++, departmentCode, code);
		courses.add(course);
		return course;
	}
	
	public Course updateCourse(Course course) {
		Course updatedCourse = getById(course.getId());
		
		if(updatedCourse.getId() != -1) {
			updatedCourse.setDepartmentCode(course.getDepartmentCode());
			updatedCourse.setCode(course.getCode());
		}
		
		return updatedCourse;
	}
	
	public Course deleteCourse(int id) {
		Course deletedCourse = null;
		
		for(int i = 0; i < courses.size(); i++) {
			if(courses.get(i).getId() == id) {
				deletedCourse = courses.remove(i);
				break;
			}
		}
		
		return deletedCourse;
	}
}
