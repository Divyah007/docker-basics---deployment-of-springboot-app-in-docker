package com.divya.dockerone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.divya.dockerone.controller"})

public class DockeroneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockeroneApplication.class, args);
	}

}
