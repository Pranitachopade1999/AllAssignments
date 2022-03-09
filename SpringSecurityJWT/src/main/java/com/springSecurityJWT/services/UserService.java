package com.springSecurityJWT.services;


import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if(username.equals("Pranita"))
		{
			return new User("Pranita", "Pranita", new ArrayList<>());
		}
		else
		{
			throw new UsernameNotFoundException("User not found");
		}
		
	}

}
