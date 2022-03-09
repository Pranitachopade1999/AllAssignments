package com.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.entity.Course;
import com.springRest.service.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return " This is home page";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	@GetMapping("course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	

}
