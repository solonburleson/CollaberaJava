package com.collabera.todo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collabera.todo.models.User;

@Service
public class UserService {
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
}
