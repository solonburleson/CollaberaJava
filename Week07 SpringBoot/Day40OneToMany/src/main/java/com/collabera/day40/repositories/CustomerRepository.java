package com.collabera.day40.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.day40.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
