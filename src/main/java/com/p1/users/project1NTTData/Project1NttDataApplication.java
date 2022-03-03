package com.p1.users.project1NTTData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Project1NttDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project1NttDataApplication.class, args);
	}

}
