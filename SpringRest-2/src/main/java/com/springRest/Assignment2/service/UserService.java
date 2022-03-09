package com.springRest.Assignment2.service;

import java.util.List;

import com.springRest.Assignment2.entities.User;

public interface UserService {

	public List<User> getUsers();
	public String validate(String userName,String password);
	
}
