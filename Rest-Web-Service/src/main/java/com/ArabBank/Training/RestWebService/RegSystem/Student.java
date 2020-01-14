package com.ArabBank.Training.RestWebService.RegSystem;

import java.util.Calendar;
import java.util.Date;

public class Student {
    private Date birthday;
    private String name;
    private Integer id;

    @Override
    public String toString() {
        return "Student{" +
                "birthday=" + birthday +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(Date birthday, String name, int id) {
        this.birthday = birthday;
        this.name = name;
        this.id = id;

    }

}
