package com.trainning.session2.adapter.rest;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trainning.session2.adapter.repository.UserManagement;
import com.trainning.session2.model.User;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	
	private UserManagement userManagement;
	

	public GreetingController(UserManagement userManagement) {
		this.userManagement=userManagement;
	}

	@GetMapping("/{userId}")
	public User greetingById(@PathVariable("userId") String id) {
		
		return userManagement
			.getUserById(id)
			.orElseThrow(()->new RuntimeException("No user with id: "+id));
	}
	
}
