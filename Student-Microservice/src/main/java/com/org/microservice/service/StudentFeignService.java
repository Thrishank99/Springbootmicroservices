package com.org.microservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.org.microservice.entity.Student;

@Service
@FeignClient(url = "http://localhost:8989/student",name = "STUDENT-CLIENT")
public interface StudentFeignService {
    @GetMapping("/findAll")
	List<Student> getAllStudentDetails();

}
