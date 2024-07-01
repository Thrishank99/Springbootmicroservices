package com.org.microservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.microservice.entity.Student;
import com.org.microservice.repository.StudentRepository;
import com.org.microservice.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> findAllStudentDetails() {
		// TODO Auto-generated method stub
	List<Student> list=studentRepository.findAll();
		return list;
	}

}
