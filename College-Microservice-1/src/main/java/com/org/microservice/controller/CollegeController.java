package com.org.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.org.microservice.entity.College;
import com.org.microservice.service.CollegeService;

@RestController
@RequestMapping("/college")
@RefreshScope
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	@Autowired
	@Lazy
	private RestTemplate restTemplate;
	
	@Value("${microservice.college-service.endpoints.endpoint.uri:}")
	private String ENDPOINT_URL;
	  
	@GetMapping("/welcome")
	public String welcomeTest() {
		return "WELCOME TO SPRING BOOT APPLICATION DEVELOPMENT MY THRISHANK APPlication UNIT TESTING AND 20% CODE COVERAGE COMPLETED DESIGN PATTERAN AND PROPERTIES ADDED.JANVERY MONTH NEWLLY ADDED THE DATA PLESE CHECK THROW JENKINS AND DOCKER";
	}
	
	@PostMapping("/save")
	public ResponseEntity<College> saveCollege(@RequestBody College college){
		College colleges=collegeService.saveCollegeDetails(college);
		return new ResponseEntity<>(colleges,HttpStatus.CREATED);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<College>> findAllColleges() {

		List<College> collegeList = collegeService.findAllCollegeDetails();
		return new ResponseEntity<List<College>>(collegeList, HttpStatus.OK);

	}
	
	@GetMapping("/collegegetStudentData")
	  public Object[] apigetData(){
	 Object[] students=restTemplate.getForObject(ENDPOINT_URL, Object[].class);
	 return students;
	 }

}
