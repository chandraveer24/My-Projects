package com.PA.Queries;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

import com.PA.Pojo.Clerk;
import com.PA.util.HibernateUtil;

public class ClerkMain {

	public static void insertClerk() {
		System.out.println("entered main");
		SessionFactory sf = HibernateUtil.sessionFactory;
		Session s = sf.openSession();

		Transaction tran = s.beginTransaction();
		Clerk clerk = new Clerk("000-303-7000", "Dave", new Date(), true);
		s.save(clerk);

		s.flush();
		tran.commit();
		s.close();
		sf.close();
	}

	public static void main(String[] args) {

		// System.out.println("main");
		updateClerk();
	}

	public static void updateClerk() {
		// System.out.println("In update");
		SessionFactory sf = HibernateUtil.sessionFactory;
		Session s = sf.openSession();

		Transaction tran = s.beginTransaction();

		Clerk clerk = s.load(Clerk.class, "000-303-6450");
		clerk.setTerminationDate(new Date());
		clerk.setActive(false);

		s.update(clerk);

		// System.out.println("finally");
		s.flush();
		tran.commit();
		s.close();
		sf.close();
	}

}
