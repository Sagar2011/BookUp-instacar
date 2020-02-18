package com.bookup.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookupWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookupWebappApplication.class, args);
	}

}
