package com.cetpa.beans;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestApp_IsA_1_Fetch 
{
	public static void main(String[] args) 
	{
	Configuration cfg = new Configuration();
	cfg.addResource("is-a-1.hbm.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter payment id: ");
	int paymentId = sc.nextInt();
	
	// fetch object of Payment that has the given id using get()
	Payment payment = session.get(Payment.class, paymentId);
	
	// check if payment is null or not
	if(payment != null)
	{
		if(payment instanceof PaymentByCash)
		{
			System.out.println("cash");
		}
		else if(payment instanceof PaymentByCard)
		{
			System.out.println("card");
		}
		else
		{
			System.out.println("cheque");
		}
	}
	else
	{
		System.out.println("Payment id not correct");
	}
	
	
	
	// close session and also close the factory
	session.close();
	factory.close();
	}
}
