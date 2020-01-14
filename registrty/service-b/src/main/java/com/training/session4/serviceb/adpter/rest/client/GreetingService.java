package com.training.session4.serviceb.adpter.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-a")
public interface GreetingService {

    @RequestMapping(method = RequestMethod.GET,
    value = "/greeting/{name}")
    public String greeting(@PathVariable("name") String name);
}
