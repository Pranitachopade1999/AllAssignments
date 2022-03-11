package com.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.DbModel;

@RestController
public class DemoController {

	@Value("${my.greetingDesc : default value}")
	private String value;
	
	@Value("Hello Pranita")
	private String staticValue;
	
	@Value("${my.list.value}")
	private List<String> list;
	
	@Value("#{${dbvalues}}")
	private Map<String,String> dbvalues;
	
	@Autowired
	private DbModel dbModel;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/show")
	public String show()
	{
		return value +"\t"+staticValue + "\t"+list +"\t"+ dbvalues +"\t"+ dbModel.getHostname()+"\t"+ dbModel.getPort()+"\t"+dbModel.getUrl(); 
	}
	
	@GetMapping("/env")
	public String ENV()
	{
		return environment.toString();
	}
	
}
