package com.collabera.day40.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.day40.models.Customer;
import com.collabera.day40.services.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService service;
	
	
	@GetMapping("/api/customers")
	public List<Customer> getAll() {
		return service.getAllCustomers();
	}
	
	@GetMapping("/api/customer/{id}")
	public Customer getById(@PathVariable("id") Long id) {
		return service.getCustomer(id);
	}
	
	@PostMapping("/api/addcustomer")
	public void addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
	}
	
	@PutMapping("/api/updatecustomer")
	public void updateCustomer(@RequestBody Customer customer) {
		service.updateCustomer(customer);
	}
	
	@PatchMapping("/api/updatecustomer/pin/{id}")
	public void updatePinForCustomer(@PathVariable("id") Long id, @RequestBody Map<String, String> pinUpdate) {
		service.updatePin(id, pinUpdate.get("pin"));
	}
	
//	@PatchMapping("/api/updatecustomer/account/{id}")
//	public void updateAccountForCustomer(@PathVariable("id") Long id, @RequestBody Account account) {
//		service.updateAccount(account, id);
//	}
	
	@DeleteMapping("/api/removecustomer/{id}")
	public void removeCustomer(@PathVariable("id") Long id) {
		service.removeCustomer(id);
	}
}
