package com.lern.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LernSpringcloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LernSpringcloudGatewayApplication.class, args);
	}

}
