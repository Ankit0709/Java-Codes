package com.cetpa.beans;

public class Car 
{
	// data members
	private String name, maker;
	private int model;

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter : car.name");
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		System.out.println("setter : car.maker");
		this.maker = maker;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		System.out.println("setter : car.model");
		this.model = model;
	}

	// no arg cnst
	public Car() 
	{
		System.out.println("object of car created");
	}
}