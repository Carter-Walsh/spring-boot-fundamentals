package com.springboot.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greeting from Spring Boot!";
    }

    @GetMapping("/different")
    public String differentIndex() {
        return "This is a different endpoint";
    }

}
