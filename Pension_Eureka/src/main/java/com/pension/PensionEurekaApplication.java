package com.pension;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PensionEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PensionEurekaApplication.class, args);
	}

}
