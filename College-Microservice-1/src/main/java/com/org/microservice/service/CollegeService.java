package com.org.microservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.microservice.entity.College;

@Service
public interface CollegeService {

	College saveCollegeDetails(College college);

	List<College> findAllCollegeDetails();

}
