package com.spring_microserviceContact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spring_microserviceContact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list=List.of(
			new Contact(1L,"pranita@gmail.com","Pranita",123L),
			new Contact(2L,"rani@gmail.com","Rani",123L),
			new Contact(3L,"khushi@gmail.com","Khushi",456L),
			new Contact(4L,"meera@gmail.com","Meera",456L),
			new Contact(5L,"gauri@gmail.com","Gauri",789L)	
			);
	
	@Override
	public List<Contact> getContactOfUser(Long userId) {
		
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
