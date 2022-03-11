package com.spring_microserviceUser.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring_microserviceUser.entity.User;

@Service
public class UserServiceImpl implements UserService{

	List<User> list =List.of(
			new User(123L,"Pranita","327646531"),
			new User(456L,"Khushi","364873819"),
			new User(789L,"Pranav","43687829")
			
			);

	@Override
	public User getUsers(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(user->user.getUserId().equals(userId)).findAny().orElse(null);
	}
	

}
