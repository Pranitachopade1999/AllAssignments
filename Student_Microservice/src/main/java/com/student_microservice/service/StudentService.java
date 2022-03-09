package com.student_microservice.service;

import java.util.List;

import com.student_microservice.entities.Student;

public interface StudentService {
	
	public Student getStudent(Integer id);
	public List<Student> getStudents();

}
