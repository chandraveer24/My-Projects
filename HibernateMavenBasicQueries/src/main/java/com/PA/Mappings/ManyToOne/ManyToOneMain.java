package com.PA.Mappings.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;

import com.PA.util.HibernateUtil;

public class ManyToOneMain {

	public static void insert()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Customer c1=new Customer();
		c1.setName("XXXXXX");
		c1.setContactNo("618-300-9800");
		
		Orders o1=new Orders();
		o1.setItem("Mice");
		
		Orders o2=new Orders();
		o2.setItem("Vitamin Tablets");
		
		
		
		c1.getOrders().add(o1);
		c1.getOrders().add(o2);

		
		Transaction t=session.beginTransaction();
		session.save(c1);
		
		session.flush();
		t.commit();
		session.close();
		sf.close();
	}
	public static void main(String[] args) {

		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Transaction t=session.beginTransaction();
		Customer c=session.load(Customer.class, 2);
		
		//System.out.println(c.getId());
		System.out.println(c.getName());
		
		for (Orders orders : c.getOrders()) {
			System.out.println(orders.getItem());
		}
		
		
		session.flush();
		t.commit();
		session.close();
		sf.close();
	}

}
