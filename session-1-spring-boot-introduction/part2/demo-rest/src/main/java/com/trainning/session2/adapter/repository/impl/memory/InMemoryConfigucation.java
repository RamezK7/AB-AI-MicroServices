package com.trainning.session2.adapter.repository.impl.memory;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.trainning.session2.adapter.repository.UserManagement;

@Configuration
@ConditionalOnProperty(prefix = "com.aspire.training.in-memory",name = "enabled",matchIfMissing = true)
public class InMemoryConfigucation {
	
	@Bean
	public UserManagement inMemoryUserManagement() {
		return new InMememoryUserManagementImpl();
	}

}
