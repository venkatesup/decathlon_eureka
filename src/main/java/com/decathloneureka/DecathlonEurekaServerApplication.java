package com.decathloneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DecathlonEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecathlonEurekaServerApplication.class, args);
	}
}
