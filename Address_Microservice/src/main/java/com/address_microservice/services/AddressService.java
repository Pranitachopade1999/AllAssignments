package com.address_microservice.services;

import java.util.List;

import com.address_microservice.entities.Address;

public interface AddressService {
	
	public Address getAddress(Integer id);
	public List<Address> getAddresses();

}
