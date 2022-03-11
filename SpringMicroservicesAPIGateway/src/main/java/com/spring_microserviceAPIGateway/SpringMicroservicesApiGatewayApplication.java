package com.spring_microserviceAPIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class SpringMicroservicesApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesApiGatewayApplication.class, args);
	}

}
