package com.springboot.tutorial;

import com.springboot.tutorial.model.Student;
import com.springboot.tutorial.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TutorialApplication {

	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}

	@Bean
	public CommandLineRunner studentDemo(StudentRepository studentRepository) {
		return (args) -> studentRepository.save(new Student(1, "123", "carter", "walsh"));
	}

}
