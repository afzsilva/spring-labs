package com.example.demofeignclientms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoFeignclientMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignclientMsApplication.class, args);
	}

}
