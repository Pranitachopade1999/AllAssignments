package com.springRest.Assignment3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springRest.Assignment3.entities.CountryInfo;

@Service
public class CountryInfoServiceImpl implements CountryInfoService {

	List<CountryInfo> list;
	
	public CountryInfoServiceImpl()
	{
		list=new ArrayList<CountryInfo>();
		list.add(new CountryInfo("India","Maharashtra","Pune",411017));
		list.add(new CountryInfo("United State","New Jersey","Hoboken",07030));
		
		
	}
	
	@Override
	public List<CountryInfo> getAllData() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public CountryInfo getDataOnZip(long zipcode) {
		CountryInfo c=null;
		for(CountryInfo ci:list)
		{
			if(ci.getZipcode()==zipcode)
			{
				c=ci;
				break;
			}
		}
		return c;
	}

}
