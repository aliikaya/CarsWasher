package com.carsWasher;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "carswasher")
public class CarsWasherProperties {
	
	private String loadTestData = "no";

	public String getLoadTestData() {
		return loadTestData;
	}

	public void setLoadTestData(String loadTestData) {
		this.loadTestData = loadTestData;
	}
	

}
