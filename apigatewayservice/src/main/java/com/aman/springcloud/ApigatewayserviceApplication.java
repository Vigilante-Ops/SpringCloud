package com.aman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApigatewayserviceApplication {

	public static void main(String[] args) {
		System.out.println("apigateway called");
		SpringApplication.run(ApigatewayserviceApplication.class, args);
	}

}
