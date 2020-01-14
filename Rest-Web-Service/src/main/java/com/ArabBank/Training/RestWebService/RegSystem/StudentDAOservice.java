package com.ArabBank.Training.RestWebService.RegSystem;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class StudentDAOservice {
    private static List<Student> students = new ArrayList<>();
    static{
        students.add(new Student(new Date(),"Ramez",1));
        students.add(new Student(new Date(),"Mohammad",2));
        students.add(new Student(new Date(),"Yousef",3));
        students.add(new Student(new Date(),"Ahmad",4));
        students.add(new Student(new Date(),"Piotr",5));
    }

    public List<Student>findAll(){
        return students;
    }
    public Student findById(int id){

        for (Student s:
             students) {
            if (s.getId()==id)
                return s;
        }
        return null;
    }
    public void save(Student student){
        if(student.getId()==0){
            student.setId(students.size());
        }
        students.add(student);

    }
}
