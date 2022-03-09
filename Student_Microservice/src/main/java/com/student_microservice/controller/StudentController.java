package com.student_microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.student_microservice.entities.Address;
import com.student_microservice.entities.Student;
import com.student_microservice.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@Autowired
	private RestTemplate restTemplate;


	@GetMapping("/{stud_id}")
	public Student getStudent(@PathVariable("stud_id") Integer stud_id)
	{
		Student student=studentservice.getStudent(stud_id);
		Address address=this.restTemplate.getForObject("http://address-service/address/"+student.getStud_id(), Address.class);
		student.setAddress(address);
		return student;
	}
	

	@GetMapping("/")
	public List<Student> getStudents()
	{
		List<Student> student=studentservice.getStudents();
		Address address=this.restTemplate.getForObject("http://address-service/address/", Address.class);
		((Student) student).setAddress(address);
		return student;
	}
}
