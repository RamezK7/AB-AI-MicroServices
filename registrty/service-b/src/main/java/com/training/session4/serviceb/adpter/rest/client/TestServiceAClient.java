package com.training.session4.serviceb.adpter.rest.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestServiceAClient  implements CommandLineRunner {

    private final GreetingService greetingService;

    public TestServiceAClient(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("greetingService = " + greetingService.getClass());
        String mosa = greetingService.greeting("Mosa");
        System.out.println("mosa = " + mosa);
    }
}
