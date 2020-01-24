package com.cetpa.beans;

public class Person 
{
	// data members
	private String fullName, emailId;
	private Car car;

	// getters and setters
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		System.out.println("setter : person.fullname");
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		System.out.println("setter : person.emailid");
		this.emailId = emailId;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		System.out.println("setter : person.car");
		this.car = car;
	}

	// no arg cnst
	public Person() 
	{
		System.out.println("object of person created");
	}
}