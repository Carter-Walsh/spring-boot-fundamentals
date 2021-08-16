package com.springboot.tutorial.repository;

import com.springboot.tutorial.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {


}
