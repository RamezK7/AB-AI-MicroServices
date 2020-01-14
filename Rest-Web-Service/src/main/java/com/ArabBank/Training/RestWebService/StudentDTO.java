package com.ArabBank.Training.RestWebService;

import java.util.Calendar;
import java.util.Date;

public class StudentDTO {
    private Date birthday;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "birthday=" + birthday +
                ", name='" + name + '\'' +
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

    public StudentDTO(Date birthday, String name) {
        this.birthday = birthday;
        this.name = name;

    }

}
