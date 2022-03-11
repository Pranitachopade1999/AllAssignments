package com.spring_microserviceUser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring_microserviceUser.entity.User;
import com.spring_microserviceUser.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUsers(@PathVariable("userId") Long userId)
	{
	User user= this.userservice.getUsers(userId);
	
	List contacts=this.restTemplate.getForObject("http://localhost:9092/contact/user/" + user.getUserId(),List.class);
	
	user.setContact(contacts);
	
	return user;
	}
	
	
}
