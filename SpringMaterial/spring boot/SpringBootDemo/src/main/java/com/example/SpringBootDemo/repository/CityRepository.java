package com.example.SpringBootDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootDemo.models.City;

public interface CityRepository extends JpaRepository<City,String> {

}
