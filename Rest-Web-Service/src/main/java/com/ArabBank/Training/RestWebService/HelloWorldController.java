package com.ArabBank.Training.RestWebService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {


    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    public String helloWorld(){
        return "Hello bitches, this my World now!";
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean 1");
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world/{name}")
    public String helloWorld(@PathVariable String name){
        return String.format("Hello %s !",name);
    }
}
