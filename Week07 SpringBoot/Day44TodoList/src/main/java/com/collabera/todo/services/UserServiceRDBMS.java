package com.collabera.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.collabera.todo.dao.UserDao;
import com.collabera.todo.models.User;

@Primary
@Service
public class UserServiceRDBMS implements UserServiceI {
	
	@Autowired
	UserDao dao;
	
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findByUserName(String userName) {
		// TODO Auto-generated method stub
		return dao.getUserByUserName(userName);
	}
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	public void addUser(String userName, String password, String fullName, String roles) {
		// TODO Auto-generated method stub
		
	}
	
	public void editUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= findByUserName(username);
		
		UserBuilder userBuilder = null;
		UserDetails userDetails = null;
		
		if(user!=null) {
			userBuilder = org.springframework.security.core.userdetails.User.withUsername(user.getUserName());
			userBuilder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
			userBuilder.roles(user.getRoles());
			
			userDetails = userBuilder.build();
			
			return userDetails;
		}
		else {
			throw new UsernameNotFoundException("User Does not Exist");
		}
	}
}
