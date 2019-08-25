package com.home.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Service1Application {

	private static final String HELLO = "/hello";
	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
	@GetMapping(HELLO)
    public String sayHello() {
        return "Hello Java Code Geeks! from service 1";
    }

}
