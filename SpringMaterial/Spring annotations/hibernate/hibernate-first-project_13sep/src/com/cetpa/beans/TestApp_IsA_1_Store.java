package com.cetpa.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestApp_IsA_1_Store 
{
	public static void main(String[] args) 
	{
	Configuration cfg = new Configuration();
	cfg.addResource("is-a-1.hbm.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	// create a card
	PaymentByCard card = new PaymentByCard();
	
	// store data inside card using setters
	card.setProductName("TV");
	card.setProductCost(16000);
	card.setNumber("SBI907809");
	card.setCvv("123");
	
	// create a cash
	PaymentByCash cash = new PaymentByCash();
	
	// store data inside cash using setters
	cash.setProductName("Java EE server 2nd edition (Book)");
	cash.setProductCost(700);
	cash.setDeno("200 * 1 + 100 * 3 + 50 * 4 = 700");
	
	// create a cheque
	PaymentByCheque cheque = new PaymentByCheque();
	
	// store data inside cheque using setters
	cheque.setProductName("Window Ac 1.5 Ton (voltas)");
	cheque.setProductCost(32000);
	cheque.setChNumber("HDBC505803");
	
	// save object of card | cash | cheque
	session.save(cash);
	session.save(cheque);
	session.save(card);
	
	// start TX and commit it
	session.beginTransaction().commit();
	
	// close session and also close the factory
	session.close();
	factory.close();
	
	System.out.println("Done");
	
	}
}
