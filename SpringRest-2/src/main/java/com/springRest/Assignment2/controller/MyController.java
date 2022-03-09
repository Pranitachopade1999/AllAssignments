package com.springRest.Assignment2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.Assignment2.entities.User;
import com.springRest.Assignment2.service.UserService;

@RestController
public class MyController {
	@Autowired
	private UserService uc;
	
	@GetMapping("/user")
	public List<User> getUsers()
	{
		return this.uc.getUsers();
		
	}
	
	@GetMapping("/user/{userName},{password}")
	public String validate(@PathVariable String userName,@PathVariable String password)
	{
		return this.uc.validate(userName,password);
		
	}

}
