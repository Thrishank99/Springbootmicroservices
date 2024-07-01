package com.org.microservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.org.microservice.entity.Student;
import com.org.microservice.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentControler {
	
	@Autowired
	private StudentService studentService;
	
	@Value("${microservice.student-service.endpoints.endpoint.uri:}")
	private String ENDPOINT_URL;
	
	/*
	 * @Value("${microservice.student-service.endpoints.endpoint.fiegn-uri:}")
	 * private String ENDPOINT_FIEGN;
	 */	
	@Autowired
	@Lazy
	private RestTemplate restTemplate;
	
	@GetMapping("/welcome")
	public String welcomeTest() {
		return "WELCOME TO SPRING BOOT APPLICATION DEVELOPMENT MY THRISHANK APPlication UNIT TESTING AND 20% CODE COVERAGE COMPLETED DESIGN PATTERAN AND PROPERTIES ADDED.JANVERY MONTH NEWLLY ADDED THE DATA PLESE CHECK THROW JENKINS AND DOCKER";
	}
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student students=studentService.saveStudentDetails(student);
		return new ResponseEntity<>(students,HttpStatus.CREATED);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Student>> findAllStudents() {

		List<Student> studentlist = studentService.findAllStudentDetails();
		return new ResponseEntity<List<Student>>(studentlist, HttpStatus.OK);

	}
	
	
	  @GetMapping("/studentgetCollegeData")
	  public Object[] apigetData(){
	 Object[] colleges=restTemplate.getForObject(ENDPOINT_URL, Object[].class);
	 return colleges;
	 }
	 
		/*
		 * @GetMapping("/studentgetfeignData") public Object[] apigetFeignData(){
		 * Object[] colleges=restTemplate.getForObject(ENDPOINT_FIEGN, Object[].class);
		 * return colleges; }
		 */

	

}
