package com.trainning.session2.adapter.repository;

import java.util.Optional;

import com.trainning.session2.model.User;

public interface UserManagement {

	public void addUser(User user) ;
	
	public Optional<User> getUserById(String id);
	
	public boolean deleteUserById(String id);

}
