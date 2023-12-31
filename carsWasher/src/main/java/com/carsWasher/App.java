package com.carsWasher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication
@EnableConfigurationProperties(value = CarsWasherProperties.class)
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
	}

}
