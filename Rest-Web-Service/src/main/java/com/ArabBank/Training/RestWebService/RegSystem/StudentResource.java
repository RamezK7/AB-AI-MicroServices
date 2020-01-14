package com.ArabBank.Training.RestWebService.RegSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
public class StudentResource {
    @Autowired
    private StudentDAOservice service;

    @GetMapping(path = "/users")
    public List<Student> retrieveAll(){
    return service.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public Student retrieveById(@PathVariable int id){
       return service.findById(id);
    }

    @PostMapping("/users")
    public void createStudent(@RequestBody Student student){
         service.save(student);
        //ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(uriVariable)
    }


}
