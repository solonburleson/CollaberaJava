package com.collabera.todo.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.collabera.todo.models.User;

public interface UserServiceI {
	public List<User> findAllUsers();
	
	public User findById(int id);
	
	public User findByUserName(String userName);
	
	public void addUser(User user);
	
	public void addUser(String userName, String password, String fullName, String roles);
	
	public void editUser(User user);
	
	public void deleteUser(int id);

	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
