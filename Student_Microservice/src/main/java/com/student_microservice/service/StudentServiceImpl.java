package com.student_microservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student_microservice.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {

	List<Student> stud=List.of(
			new Student(1,"Pranita","pranita@gmail.com"),
			new Student(2,"Khushi","khushi@gmail.com"),
			new Student(3,"Meera","meera@gmail.com")
		
			);
	
	
	
	@Override
	public Student getStudent(Integer id) {
		
		return stud.stream().filter(student->student.getStud_id().equals(id)).findAny().orElse(null);
	}



	@Override
	public List<Student> getStudents() {
		
		return stud;
	}

}
