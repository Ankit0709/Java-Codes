package com.example.SpringBootDemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.SpringBootDemo.models.City;
import com.example.SpringBootDemo.repository.CityRepository;

@Service
public class CityService 
{
	@Autowired
    CityRepository cityRepository;
	
	public String saveCity(City city)
	{
		cityRepository.save(city);
		return "Data Saved";
	}
	
	public List<City> getCities()
	{
		return cityRepository.findAll();
	}
	
	public Optional<City> getCity(String city)
	{
		return cityRepository.findById(city);
	}
	
	public String deleteCity(City city)
	{
		cityRepository.delete(city);
		return "Data deleted";
	}
}
