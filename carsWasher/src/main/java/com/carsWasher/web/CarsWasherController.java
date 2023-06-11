package com.carsWasher.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.carsWasher.dao.jpa.CarsWasherRepository;
import com.carsWasher.model.Car;
import com.carsWasher.model.Driver;

@RestController
@RequestMapping(value = "/carsWasherController") // bu anatation ile http://localhost:8080/carsWasherController üzerinden gelen bütün istekler karşılanacak.

public class CarsWasherController {
	
	@Autowired
	private CarsWasherRepository repository;
	
	
	

	
	
	@RequestMapping("/car/{id}")
	public Car getCar(@PathVariable int id) {
		return repository.getCar(id);
	}
	
	@RequestMapping("/cars")
	public List<Car> getCars(){
		return repository.getCars();
		
	}
	
	
	
	

}
