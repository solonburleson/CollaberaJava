package com.collabera.day39.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.day39.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	
}
