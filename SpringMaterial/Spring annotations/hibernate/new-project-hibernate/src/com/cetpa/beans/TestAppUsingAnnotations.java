package com.cetpa.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestAppUsingAnnotations 
{
	public static void main(String[] args) 
	{
	Configuration cfg = new Configuration();
	cfg.configure();
	
	cfg.addAnnotatedClass(Doctor.class);

	SessionFactory fact = cfg.buildSessionFactory();
	
	Session session = fact.openSession();
	
	Doctor doc = new Doctor(1, "Dr. Mangla", "Gala | Gurda | Kaleji", 
	"shamshan wali gali",0.0f,21);
	
	session.save(doc);
	
	session.beginTransaction().commit();
	
	session.close();
	
	fact.close();
	
	System.out.println("OK");
	
	}
}
