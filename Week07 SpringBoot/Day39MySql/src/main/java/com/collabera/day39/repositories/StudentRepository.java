package com.collabera.day39.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.day39.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findAll();
	Optional<Student> findById(Long id);
}
