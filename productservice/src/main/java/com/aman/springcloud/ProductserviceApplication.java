package com.aman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ProductserviceApplication {

	public static void main(String[] args) {
		System.out.println("product called");
		SpringApplication.run(ProductserviceApplication.class, args);
	}

}
