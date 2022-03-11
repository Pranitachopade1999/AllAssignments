package com.address_microservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.address_microservice.entities.Address;

@Service
public class AddressServiceImpl implements AddressService {

	List<Address> address=List.of(
			new Address("Pune","Maharashtra",411017,1),
			new Address("Chinchwad","Maharashtra",411033,2),
			new Address("Pashan","Maharashtra",411056,3)
			
			
			);
	
	
	@Override
	public Address getAddress(Integer id) {
		return address.stream().filter(address->address.getStud_id().equals(id)).findAny().orElse(null);
	}


	@Override
	public List<Address> getAddresses() {
	
		return address;
	}

}
