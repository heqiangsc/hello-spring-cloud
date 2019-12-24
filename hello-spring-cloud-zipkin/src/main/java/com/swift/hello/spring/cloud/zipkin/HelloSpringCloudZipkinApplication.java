package com.swift.hello.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class HelloSpringCloudZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringCloudZipkinApplication.class, args);
	}

}
