package com.cetpa.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp 
{
	public static void main(String[] args) 
	{
	// start spring container
	ClassPathXmlApplicationContext ctx = new 
			ClassPathXmlApplicationContext("autowire.xml");	

	// fetch object of car from the container
	Car c = (Car) ctx.getBean("c");
	
	// show name of car
	System.out.println(c.getName());
	}
}