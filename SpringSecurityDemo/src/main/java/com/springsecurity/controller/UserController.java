package com.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.model.User;
import com.springsecurity.service.UserService;

@RestController
@RequestMapping("/users")

public class UserController {
	
	@Autowired
	private UserService uc;
	
	@GetMapping("/")
	public List<User> getUsers()
	{
		return this.uc.getUsers();
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username)
	{
		return this.uc.getUser(username);
	}
	
	@PostMapping("/")
	public User addUser(@RequestBody User user)
	{
		return this.uc.addUser(user);
	}
	
	@GetMapping("/home")
	@PreAuthorize("hasRole('ADMIN')")
	public String Home()
	{
		return "This is home page";
	}
	

}
