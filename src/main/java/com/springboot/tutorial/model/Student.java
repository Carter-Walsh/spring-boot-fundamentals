package com.springboot.tutorial.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String studentEmail;
    private String studentFirstName;
    private String studentLastName;

    public Student() {
    }

    public Student(Integer id, String studentEmail, String studentFirstName, String studentLastName) {
        this.id = id;
        this.studentEmail = studentEmail;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                '}';
    }


}
