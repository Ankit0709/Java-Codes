package com.cetpa.beans;

import org.hibernate.Session;

public class TestApp 
{
	public static void testUpdate(int carId,String name,String maker)
	{
		Session session = SessionProvider.getSession();
		
		// fetch a car at given carId
		MyCar car = session.get(MyCar.class, carId);
		
		// 
		if(car != null)
		{
			car.setCarName(car.getCarName() + name);
			car.setCarMaker(car.getCarMaker() + maker);
			
			// update this object
			session.update(car);
			
			// get object of TX and commit it
			session.beginTransaction().commit();
			
			// close this session
			session.close();
			
			System.out.println("Update done");
		}
		else
		{
			System.out.println("object not found with this id");
		}
		
	}

	public static void testDelete(int carId)
	{
		Session session = SessionProvider.getSession();
		
		// fetch a car at given carId
		MyCar car = session.get(MyCar.class, carId);
		
		// 
		if(car != null)
		{
			// delete this object
			session.delete(car);
			
			// get object of TX and commit it
			session.beginTransaction().commit();
			
			// close this session
			session.close();
			
			System.out.println("Delete done");
		}
		else
		{
			System.out.println("object not found with this id");
		}
		
	}
	
	public static void testMerge(int oldCarId,int newCarId)
	{
		if(oldCarId == newCarId)
		{
		// get two sessions
		Session session01 = SessionProvider.getSession();
		Session session02 = SessionProvider.getSession();
		
		// fetch a car using session#1
		MyCar c1 = session01.get(MyCar.class,oldCarId);
		
		// close session#1
		session01.close();
		
		// change the data of object c1
		c1.setCarName(c1.getCarName() + "1.2 xls");

		// fetch a car using session#2
		MyCar c2 = session02.get(MyCar.class,newCarId);

		// merge object c2 using the content of c1
		session02.merge(c1);
				
		// start TX and commit
		session02.beginTransaction().commit();
		
		System.out.println("merge was successfull");
		}
		else
		{
			System.out.println("car id mismatch");
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public static void main(String[] args) 
	{
//		TestApp.testUpdate(1," 1.2 LDI"," suzuki india ltd");
//		TestApp.testDelete(3);
		TestApp.testMerge(2, 2);
	}
}
