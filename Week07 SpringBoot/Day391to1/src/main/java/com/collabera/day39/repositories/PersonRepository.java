package com.collabera.day39.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.day39.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
}
