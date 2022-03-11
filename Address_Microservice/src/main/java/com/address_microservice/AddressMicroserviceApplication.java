package com.address_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AddressMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressMicroserviceApplication.class, args);
	}

}
