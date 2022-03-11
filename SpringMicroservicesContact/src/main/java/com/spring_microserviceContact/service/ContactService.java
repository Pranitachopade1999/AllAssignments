package com.spring_microserviceContact.service;

import java.util.List;

import com.spring_microserviceContact.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContactOfUser(Long userId);

}
