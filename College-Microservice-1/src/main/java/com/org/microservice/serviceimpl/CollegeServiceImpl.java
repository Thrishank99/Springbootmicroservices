package com.org.microservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.microservice.entity.College;
import com.org.microservice.repository.CollegeRepository;
import com.org.microservice.service.CollegeService;
@Component
public class CollegeServiceImpl implements CollegeService {
	
	@Autowired
	private CollegeRepository collegeRepository;

	@Override
	public College saveCollegeDetails(College college) {
		// TODO Auto-generated method stub
		return collegeRepository.save(college);
	}

	@Override
	public List<College> findAllCollegeDetails() {
		// TODO Auto-generated method stub
		List<College> list=collegeRepository.findAll();
		return list;
	}

}
