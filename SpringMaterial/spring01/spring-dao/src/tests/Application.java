package tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
import dao.ImpCarDao;

public class Application 
{
	public static void main(String[] args) 
	{
	// start the container
	ClassPathXmlApplicationContext ctx = new 
			ClassPathXmlApplicationContext("dao.xml");
	
	// get the object of DAO from the container
	ImpCarDao dao = (ImpCarDao) ctx.getBean("refDao"); 
	
	// create object of Car (Car means my DTO)
	Car c = new Car();
	
	// store the data of car using setters
	c.setName("Swift");
	c.setMaker("Maruti Suzuki");
	c.setType("Deezal");
	
	// store the object of car (ie. DTO) inside the database
	// using DAO
	dao.insertCar(c);
	
	System.out.println("AAl is WEll");
	}
}
