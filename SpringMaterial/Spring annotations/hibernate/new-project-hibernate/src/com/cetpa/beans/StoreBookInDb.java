package com.cetpa.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreBookInDb 
{
	public static void main(String[] args) 
	{
	Configuration cfg = new Configuration();
	
	cfg.configure();
	
	cfg.addResource("Book.hbm.xml");
	
	SessionFactory factory = cfg.buildSessionFactory();
	
	Session session = factory.openSession();
	
	Book book = new Book("C++","YRK",350,"BPB");

	Transaction tx = session.beginTransaction();
	
	session.save(book);
	
	tx.commit();
	
	session.close();
	
	factory.close();
	
			
	}
}