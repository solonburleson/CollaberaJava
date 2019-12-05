package com.collabera.school.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.collabera.school.models.Student;

@Service
public class StudentService {
	private static List<Student> students = new ArrayList<Student>();
	private static int idCounter = 1;
	
	static {
		students.add(new Student(idCounter++, "Lebron", "James", LocalDate.of(1982, 12, 30), "Basketball"));
		students.add(new Student(idCounter++, "John", "Truong", LocalDate.of(1997, 8, 7), "Software Engineering"));
		students.add(new Student(idCounter++, "Jeffrey", "Epstein", LocalDate.of(1879, 3, 14), "Physics"));
		students.add(new Student(idCounter++, "Emma", "Stone", LocalDate.of(1992, 7, 10), "Acting"));
		students.add(new Student(idCounter++, "Barack", "Obama", LocalDate.of(1967, 5, 22), "Law"));
		students.add(new Student(idCounter++, "Shia", "LeBeouf", LocalDate.of(1986, 6, 11), "Acting"));
	}
	
	//Create
	public Student addStudent(String firstName, String lastName, LocalDate dob, String major) {
		Student newStudent = new Student(idCounter++, firstName, lastName, dob, major);
		students.add(newStudent);
		return newStudent;
	}
	
	//Read
	public List<Student> getAllStudents() {
		return students;
	}
	
	public Student getById(int id) {
		Student student = new Student();
		
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getId() == id) {
				student = students.get(i);
				break;
			}
		}
		
		return student;
	}
	
	public List<Student> getByMajor(String major){
		List<Student> byMajor = students.stream().filter(s -> s.getMajor().toLowerCase().equals(major.toLowerCase())).collect(Collectors.toList());
		return byMajor;
	}
	
	//Update
	public Student updateStudent(Student student) {
		Student studentToUpdate = getById(student.getId());
		
		if(studentToUpdate != null) {
			studentToUpdate.setFirstName(student.getFirstName());
			studentToUpdate.setLastName(student.getLastName());
			studentToUpdate.setDateOfBirth(student.getDateOfBirth());
			studentToUpdate.setMajor(student.getMajor());
		}
		
		return studentToUpdate;
	}
	
	//Delete
	public Student deleteStudent(int id) {
		Student studentToDelete = null;
		
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getId() == id) {
				studentToDelete = students.remove(i);
				break;
			}
		}
		
		return studentToDelete;
	}
	
	public void deleteAllStudents() {
		students.clear();
	}
}
