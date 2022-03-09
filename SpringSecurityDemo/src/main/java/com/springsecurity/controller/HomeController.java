package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {
	
	@GetMapping("/home")
	public String Home()
	{
		return "This is home page";
	}
	
	@GetMapping("/login")
	public String Login()
	{
		return "This is login page";
	}
	
	@GetMapping("/register")
	public String Register()
	{
		return "This is register page";
	}

	@GetMapping("/signin")
	public String SignIn()
	{
		return "login.html";
	}

		
}
