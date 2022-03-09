package com.springRest.Assignment1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

	@GetMapping
	public String show()
	{
		return "Hello World";
	}
	
}
