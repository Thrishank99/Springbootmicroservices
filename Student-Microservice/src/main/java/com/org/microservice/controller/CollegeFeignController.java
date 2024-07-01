package com.org.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.microservice.entity.Student;
import com.org.microservice.service.StudentFeignService;

@RestController
@RequestMapping("/feignstudents")
public class CollegeFeignController {
	
	@Autowired
	private StudentFeignService studentFeignService;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		System.out.println(environment.getProperty("local.server.port"));
		return studentFeignService.getAllStudentDetails();
		
	}

}
