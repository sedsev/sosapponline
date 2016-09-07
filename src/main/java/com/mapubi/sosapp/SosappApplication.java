package com.mapubi.sosapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class SosappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SosappApplication.class, args);
	}
}
