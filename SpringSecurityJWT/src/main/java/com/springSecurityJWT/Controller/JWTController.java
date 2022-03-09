package com.springSecurityJWT.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JWTController {

	@RequestMapping(value="/token",method=RequestMethod.POST)
	public ResponseEntity<?> generatetoken()
	{
		return null;
	}
}
