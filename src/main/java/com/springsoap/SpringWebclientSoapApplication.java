package com.springsoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springsoap")
public class SpringWebclientSoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebclientSoapApplication.class, args);
	}

}
