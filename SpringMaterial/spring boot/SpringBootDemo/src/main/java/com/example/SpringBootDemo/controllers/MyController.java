package com.example.SpringBootDemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootDemo.models.City;
import com.example.SpringBootDemo.services.CityService;

@RestController
public class MyController
{	
	@Autowired
	CityService service;
	
	@GetMapping(value="/get-cities",produces="application/json")
	public List<City> getCities()
	{
		return service.getCities();
	}
	
	@PostMapping(value="/save-city",consumes="application/json")
	public String saveCity(@RequestBody City city)
	{
		return service.saveCity(city);
		
	}
	
	

}
