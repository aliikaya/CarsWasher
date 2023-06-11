package com.carsWasher;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarsWasherConfiguration {
	
	@Autowired
	private CarsWasherProperties carsWasherProperties;
	
	@PostConstruct
	public void init() {
		System.out.println("Load Test Data: " + carsWasherProperties.getLoadTestData());
	}

}
