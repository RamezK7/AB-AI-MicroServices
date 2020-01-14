package com.trainning.session1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class AtStartUp implements CommandLineRunner{


	public AtStartUp() {
		System.out.println("Instance");
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(
				"Application is started and this method is called: ");
		
	}

}
