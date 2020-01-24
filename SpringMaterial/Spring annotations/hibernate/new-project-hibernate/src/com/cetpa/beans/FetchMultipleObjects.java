package com.cetpa.beans;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchMultipleObjects 
{
	public static void main(String[] args) 
	{
	// get object of Configuration class
	Configuration cfg = new Configuration();
	
	// specify the name and location of resource file
	cfg.addResource("MyCar.hbm.xml");
	
	// get the object of SessionFactory interface
	SessionFactory factory = cfg.buildSessionFactory();
	
	// get the object of Session interface
	Session session = factory.openSession();
	
	// create a HQL statement
	String hql = "from com.cetpa.beans.MyCar where carId >= 2 and carId <= 3";
	
	// execute HQL statement
	Query<MyCar> query = session.createQuery(hql);
	
	// fetch the objects (means records) from the database
	// on the basis of HQL
	List<MyCar> cars = query.list();
	
	// fetch the objects from the list using for each loop
	for(MyCar car : cars)
	{
		System.out.println(car.getCarId()+"\n"+car.getCarName()+"\n"
				+ ""+car.getCarMaker());
		System.out.println();
	}
	
	// close session and factory
	session.close();
	factory.close();
	
	
	}
}
