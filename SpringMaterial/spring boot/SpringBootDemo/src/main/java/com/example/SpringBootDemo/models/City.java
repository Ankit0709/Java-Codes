package com.example.SpringBootDemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class City
{
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private String name;
  
  private float min_temp,max_temp;
    
  private int humidity;
  private float lat,longitude;
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getMin_temp() {
	return min_temp;
}
public void setMin_temp(float min_temp) {
	this.min_temp = min_temp;
}
public float getMax_temp() {
	return max_temp;
}
public void setMax_temp(float max_temp) {
	this.max_temp = max_temp;
}
public int getHumidity() {
	return humidity;
}
public void setHumidity(int humidity) {
	this.humidity = humidity;
}
public float getLat() {
	return lat;
}
public void setLat(float lat) {
	this.lat = lat;
}
public float getLongitude() {
	return longitude;
}
public void setLongitude(float longitude) {
	this.longitude = longitude;
}
  public City()
  {
	  
  }
public City(String name, float min_temp, float max_temp, int humidity, float lat, float longitude) {
	super();
	this.name = name;
	this.min_temp = min_temp;
	this.max_temp = max_temp;
	
	this.humidity = humidity;
	this.lat = lat;
	this.longitude = longitude;
	
}
  
}
