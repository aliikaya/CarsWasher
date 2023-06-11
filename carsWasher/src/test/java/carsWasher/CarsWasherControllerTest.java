package carsWasher;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import com.carsWasher.model.Car;

public class CarsWasherControllerTest {
	
	private RestTemplate restTemplate;
	
	@Before
	public void init() {
		restTemplate = new RestTemplate();
	}
	
	@Test
	public void getCarsTest() {
		List cars = restTemplate.getForObject("http://localhost:8080/carsWasherController/cars", List.class);
		System.out.println("Size of the car list: " + cars.size());
	}
	
	@Test
	public void getCar() {
		Car car = restTemplate.getForObject("http://localhost:8080/carsWasherController/car/1", Car.class);
		System.out.println("Car model is: " + car.getModel());
		
		
	}
	

}
