package com.cetpa.beans;

public class MyCar 
{
	// data members
	private int carId;
	private String carName, carMaker;

	// setters and getters
	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		System.out.println("setter for car id");
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		System.out.println("setter for car name");
		this.carName = carName;
	}

	public String getCarMaker() {
		return carMaker;
	}

	public void setCarMaker(String carMaker) {
		System.out.println("setter for car maker");
		this.carMaker = carMaker;
	}

	// param cnst
	public MyCar(int carId, String carName, String carMaker) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carMaker = carMaker;
	}

	// no arg cnst
	public MyCar() {
		System.out.println("object of MyCar created with address "+this);
	}	
}
