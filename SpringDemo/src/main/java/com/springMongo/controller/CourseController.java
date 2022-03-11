package com.springMongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springMongo.entities.Course;
import com.springMongo.repository.CourseRepo;

@RestController
public class CourseController {
	
	@Autowired
	private CourseRepo cr;
	
	@GetMapping("/course")
	public List<Course> getCourses()
	{
		return this.cr.findAll();
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course)
	{
		return this.cr.save(course);
	}
	

}
