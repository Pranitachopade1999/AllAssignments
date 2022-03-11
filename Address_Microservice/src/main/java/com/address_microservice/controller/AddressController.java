package com.address_microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address_microservice.entities.Address;
import com.address_microservice.services.AddressService;



@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService addressservice;
	
	@GetMapping("/{stud_id}")
	public Address getAddress(@PathVariable("stud_id") Integer stud_id)
	{
		return this.addressservice.getAddress(stud_id);
		
	}
	
	@GetMapping("/")
	public List<Address> getAddresses()
	{
		return this.addressservice.getAddresses();
		
	}

}
