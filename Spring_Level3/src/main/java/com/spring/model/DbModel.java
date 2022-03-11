package com.spring.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties("db")
@Data
public class DbModel {
	
	private String hostname;
	private int port;
	private String url;
	
}
