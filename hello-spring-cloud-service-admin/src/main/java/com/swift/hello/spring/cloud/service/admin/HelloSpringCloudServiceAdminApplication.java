package com.swift.hello.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloSpringCloudServiceAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringCloudServiceAdminApplication.class, args);
	}

}
