package com.springboot.tutorial.controller;

import com.springboot.tutorial.model.Student;
import com.springboot.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String index() {
        return "Greeting from Spring Boot!";
    }

    @GetMapping("/add")
    public String add() {

        studentRepository.save(new Student(2, "456", "rocket", "wayne"));
        return "Something has been added!";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        studentRepository.deleteById(id);
        return "It was deleted!";
    }

}
