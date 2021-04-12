package com.niculescu.todoMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class TodoMicroserviceApplication {

	private static int count = 0;

	public static void main(String[] args) {
		SpringApplication.run(TodoMicroserviceApplication.class, args);
	}

	@RequestMapping("/")
	public String test() {
		return "Todo Microservice is Up "+(count++);
	}

}
