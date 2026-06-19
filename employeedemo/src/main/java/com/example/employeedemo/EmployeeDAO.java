package com.example.employeedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmployeeDAO {
	private static SessionFactory factory=new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
	private Session getSession() {
		return factory.openSession();
	}
	public void insert(Employee e) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.persist(e);
        tx.commit();
        session.close();
    }
	   public Employee findById(int id) {
	        Session session = getSession();
	        Employee stu = session.find(Employee.class, id);
	        session.close();
	        return stu;
	    }
	    public List<Employee> findAll() {
	        Session session = getSession();
	        List<Employee> emp= session.createQuery("from Student", Employee.class).list();
	        session.close();
	        return emp;

	    }
	    public void update(Employee e) {
	        Session session = getSession();
	        Transaction tx = session.beginTransaction();
	        session.merge(e);
	        tx.commit();
	        session.close();

	    }
	    public void delete(int id) {
	        Session session = getSession();
	        Transaction tx = session.beginTransaction();
	        Employee emp = session.find(Employee.class, id);

	        if (emp != null) {

	            session.remove(emp);

	        }
	        tx.commit();
	        session.close();

	    }
}
