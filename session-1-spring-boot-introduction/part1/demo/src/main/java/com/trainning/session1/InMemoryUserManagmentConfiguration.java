package com.trainning.session1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@ConditionalOnProperty(prefix = "com.aspire.trainning.in-memory"
//,name="enabled"
//
//, matchIfMissing = false
//)
@Profile({"dev","qa"})
public class InMemoryUserManagmentConfiguration {
	
	@Bean("test")
	public UserManagement inMemory() {
		return new InMemoryUserManagement();
	}

}
