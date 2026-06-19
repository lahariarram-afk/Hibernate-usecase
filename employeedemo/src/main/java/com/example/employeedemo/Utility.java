package com.example.employeedemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Utility {
	private static SessionFactory sessionfactory=new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
	public static SessionFactory getSessionFactory() {
		return sessionfactory;
	}
	public static void shutdown() {
		sessionfactory.close();
	}
}
