package com.example.demowiremock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoWiremockApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWiremockApplication.class, args);
	}

}
