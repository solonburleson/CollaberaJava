package com.collabera.day40.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.day40.models.Customer;
import com.collabera.day40.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repo;
	
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}
	
	public Customer getCustomer(Long id) {
		Optional<Customer> found = repo.findById(id);
		
		if(found.isPresent()) {
			return found.get();
		} else {
			return new Customer();
		}
	}
	
	public void addCustomer(Customer customer) {
		boolean foundCustomer = repo.findAll().stream().anyMatch(c -> c.getId() == customer.getId());
		
		if(!foundCustomer) {
			repo.save(customer);
		}
	}
	
	public void updateCustomer(Customer customer) {
		Optional<Customer> optToUpdate = repo.findById(customer.getId());
		
		if(optToUpdate.isPresent()) {
			Customer toUpdate = optToUpdate.get();
			
			toUpdate.setFirstName(customer.getFirstName());
			toUpdate.setLastName(customer.getLastName());
			toUpdate.setPin(customer.getPin());
			
			repo.save(toUpdate);
		}
	}
	
	public void updatePin(Long id, String pin) {
		Customer custToUpdate = getCustomer(id);
		if(custToUpdate.getId() != -1) {
			custToUpdate.setPin(pin);
			repo.save(custToUpdate);
		}
	}
	
//	public void updateAccount(Account account, Long id) {
//		Customer customer = getCustomer(id);
//		
//		if(customer.getId() != -1L) {
//			Account accToEdit = null;
//			for(Account a : customer.getAccounts()) {
//				if(a.getId() == account.getId()) {
//					accToEdit = a;
//					break;
//				}
//			}
//			if(accToEdit != null) {
//				
//			}
//		}
//	}
	
	public void removeCustomer(Long id) {
		repo.deleteById(id);
	}
}
