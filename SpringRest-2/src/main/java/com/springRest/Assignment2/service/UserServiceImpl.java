package com.springRest.Assignment2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springRest.Assignment2.entities.User;

@Service
public class UserServiceImpl implements UserService{
	
 List<User> list=null;
 
 public UserServiceImpl()
 {
	 list=new ArrayList<User>();
	 list.add(new User("Pranita","Chopade"));
	 list.add(new User("Khushi","Chopade"));
	 
	 
 }
	
	@Override
	public List<User> getUsers() {
		
		return list;
	}

	@Override
	public String validate(String userName,String password) {
		String str="Invalid User";
		
		for(User u:list)
		{
			if((u.getUserName().equals(userName)))
				{
					if(u.getPassword().equals(password))
					{
						str="Valid User";
						break;
					}
				
				}
		}
		return str;
	}
}

