package com.lottery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lottery")
public class BootApp {

	public static void main(String[] args) {
		SpringApplication.run(BootApp.class, args);
	}
}
