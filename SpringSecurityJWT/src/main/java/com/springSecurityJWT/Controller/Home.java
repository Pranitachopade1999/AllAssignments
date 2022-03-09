package com.springSecurityJWT.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@GetMapping("/welcome")
	public String Welcome()
	{
		String text="This is private method";
		text +="Unathourised person can't access it";
		return text;
	}

}
