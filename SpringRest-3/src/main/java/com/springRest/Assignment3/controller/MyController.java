package com.springRest.Assignment3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.Assignment3.entities.CountryInfo;
import com.springRest.Assignment3.service.CountryInfoService;

@RestController
public class MyController {

	@Autowired
	private CountryInfoService cis;
	
	@GetMapping("/countryInfo")
	public List<CountryInfo> getAllData()
	{
		return this.cis.getAllData();
	}
	
	@GetMapping("/countryInfo/{zipcode}")
	public CountryInfo getDataOnZip(@PathVariable long zipcode)
	{
		return this.cis.getDataOnZip(zipcode);
	}
}
