package com.springRest.Assignment3.service;

import java.util.List;

import com.springRest.Assignment3.entities.CountryInfo;

public interface CountryInfoService {
	
public List<CountryInfo> getAllData();
public CountryInfo getDataOnZip(long zipcode);

}
