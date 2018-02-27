package com.PA.Mappings.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.PA.util.HibernateUtil;

public class OneToOneMain {

	public static void main(String[] args) {

		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Employee e=new Employee();
		e.setName("Harsha");
		e.setSalary(90897);
		
		Address a=new Address();
		a.setCity("Harrisburg");
		a.setState("PA");
		
		e.setAddress(a);
		a.setEmploye(e);
		
		Transaction t=session.beginTransaction();
		session.save(e);
		
		session.flush();
		t.commit();
		session.close();
		sf.close();
	}

}
