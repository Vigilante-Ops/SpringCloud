package com.aman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CouponserviceApplication {

	public static void main(String[] args) {
		System.out.println("coupon called");
		SpringApplication.run(CouponserviceApplication.class, args);
	}

}
