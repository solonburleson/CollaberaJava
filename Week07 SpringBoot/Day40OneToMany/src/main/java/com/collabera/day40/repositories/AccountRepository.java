package com.collabera.day40.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.day40.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
