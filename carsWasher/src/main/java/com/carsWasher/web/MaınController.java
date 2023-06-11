package com.carsWasher.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MaınController {
	
	
	
	@RequestMapping(value = { "/" , "/index.html"})
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		
		
		
		return modelAndView;
	}
	
	
	
	@RequestMapping(value = "/login.html")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;		
		
		
	}
	
	

}
