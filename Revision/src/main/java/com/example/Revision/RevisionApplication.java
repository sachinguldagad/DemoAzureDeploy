package com.example.Revision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RevisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevisionApplication.class, args);
	}

}
