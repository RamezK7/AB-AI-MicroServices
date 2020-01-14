package com.trainning.session1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@ConditionalOnProperty(prefix = "com.aspire.trainning.in-memory-no-dpl"
//,name="enabled", matchIfMissing = false
//)
@Profile("prod")

public class InMemoryUserManagmentNoDuplicationConfiguration {
	
	@Bean
	public UserManagement inMemoryNoDuplication() {
		return new InMemoryUserManagementNoDuplication();
	}

}
