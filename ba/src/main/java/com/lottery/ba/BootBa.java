package com.lottery.ba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lottery")
public class BootBa {

	public static void main(String[] args) {
		SpringApplication.run(BootBa.class, args);
	}
}
