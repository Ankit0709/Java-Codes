package com.cetpa.beans;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionProvider 
{	
	public static Session getSession()
	{
		return new Configuration().configure().
		addResource("com/cetpa/beans/MyCar.hbm.xml").buildSessionFactory().openSession();
	}
}
