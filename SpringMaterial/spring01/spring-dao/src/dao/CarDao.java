package dao;

import beans.Car;

// this is my DAO (what to do with DTO?)
public interface CarDao 
{
	// specify the task to be implemented
	public abstract void insertCar(Car c);
}