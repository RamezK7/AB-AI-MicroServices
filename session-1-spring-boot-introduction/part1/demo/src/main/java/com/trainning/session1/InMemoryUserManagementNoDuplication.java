package com.trainning.session1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;


public class InMemoryUserManagementNoDuplication implements UserManagement{

	Set<User> users = new HashSet<>();
	
	
	@Override
	public void addUser(User user) {
		users.add(user);
	}
	
	@Override
	public void printUsers() {
		
		System.out.println(" In memory User Management No duplication");
		users	
		 	.stream()
		 	.forEach(System.out::println);
	}
}
