package com.trainning.session1;

import java.util.ArrayList;
import java.util.List;


public class InMemoryUserManagement implements UserManagement{

	List<User> users = new ArrayList<>();
	
	
	@Override
	public void addUser(User user) {
		users.add(user);
	}
	
	@Override
	public void printUsers() {
		
		System.out.println(" In memory User Management");
		users	
		 	.stream()
		 	.forEach(System.out::println);
	}
}
