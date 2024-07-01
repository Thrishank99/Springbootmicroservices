package com.org.microservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.microservice.entity.Student;

@Service
public interface StudentService {

	Student saveStudentDetails(Student student);

	List<Student> findAllStudentDetails();

}
