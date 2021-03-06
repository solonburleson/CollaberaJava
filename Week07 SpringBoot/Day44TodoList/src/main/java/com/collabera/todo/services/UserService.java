package com.collabera.todo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.collabera.todo.models.User;

@Service
public class UserService implements UserDetailsService {
	private static List<User> users = new ArrayList<User>();
	private static int IDCounter = 1;
	
	static {
		users.add(new User(IDCounter++, "Solon", "admin", "Solon Burleson", "ADMIN"));
	}
	
	public List<User> findAllUsers() {
		return users;
	}
	
	public User findById(int id) {
		return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
	}
	
	public User findByUserName(String userName) {
		return users.stream().filter(u -> u.getUserName().equals(userName)).findFirst().orElse(null);
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public void addUser(String userName, String password, String fullName, String roles) {
		addUser(new User(IDCounter++, userName, password, fullName, roles));
	}
	
	public void editUser(User user) {
		deleteUser(user.getId());
		users.add(user);
	}
	
	public void deleteUser(int id) {
		User user = users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		users.remove(user);
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
