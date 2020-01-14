package com.trainning.session1;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AtStartUpConfiguration {


	@Bean
	public CommandLineRunner startUp(List<UserManagement> managements,Environment env) {
		
		return args->{
			managements
				.stream()
				.peek(um->um.addUser(new User("1","Mosa")))
				.forEach(UserManagement::printUsers);
			
		};
	}
	
	
	@Bean
	public CommandLineRunner startUp2( List<UserManagement> managements
			,ProjectConfiguration configuration) {
		
		return args->{
			managements
			.stream()
			.peek(um->um.addUser(new User("2","Ahmad")))
			.peek(um->um.addUser(new User("2","Ahmad")))
			.forEach(UserManagement::printUsers);

		};	}
}
