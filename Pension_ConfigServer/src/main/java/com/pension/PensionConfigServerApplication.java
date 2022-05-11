package com.pension;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PensionConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PensionConfigServerApplication.class, args);
	}

}
