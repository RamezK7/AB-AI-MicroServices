package com.training.session4.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=5040

//mvn install
//java -Dserver.port=5040  -jar service-a-0.0.1-SNAPSHOT.jar
public class ServiceAApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServiceAApplication.class, args);
	}

}
