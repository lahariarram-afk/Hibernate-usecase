package com.example.onlinefooddemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.transaction.Transaction;

public class OrderDAO {
	private static SessionFactory factory=new Configuration().configure().buildSessionFactory();
	private Session getSession() {
		return factory.getCurrentSession();
	}
	public void insert(Order o) {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.persist(o);
		tx.commit();
		session.close();
	}
	public void findById(int id) {
		Session session=getSession();
		
	}
}
