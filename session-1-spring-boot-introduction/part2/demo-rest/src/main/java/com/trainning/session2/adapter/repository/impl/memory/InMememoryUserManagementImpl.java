package com.trainning.session2.adapter.repository.impl.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.trainning.session2.adapter.repository.UserManagement;
import com.trainning.session2.model.User;


 class InMememoryUserManagementImpl implements UserManagement {

	Map<String,User> users= new HashMap() {{
		put("1",new User("1","Ahmad"));
		put("2",new User("2","Mosa"));
	}};
	
	@Override
	public void addUser(User user) {

		users.put(user.getId(),user);
	}

	@Override
	public Optional<User> getUserById(String id) {

		User user= users.get(id);
		
		return user==null?Optional.empty():Optional.of(user);
	}

	@Override
	public boolean deleteUserById(String id) {
		
		return users.remove(id)!=null;
	}

}
