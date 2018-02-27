package com.PA.Queries;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;

import com.PA.Pojo.Author;
import com.PA.util.HibernateUtil;

public class SecondLevelCacheMain {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.sessionFactory;
		Session s = sf.openSession();

		//Transaction tran = s.beginTransaction();
		
		Author a= s.load(Author.class, 3);
		System.out.println(a.getLastName());
		
		Author a1= s.load(Author.class, 3);
		System.out.println(a1.getFirstName());
		s.close();
		Session s1 = sf.openSession();
		
		Author a2= s1.load(Author.class, 3);
		System.out.println(a2.getId());
		

		//s.flush();
		//s1.flush();
		//tran.commit();
		
		s1.close();
		sf.close();
	}

}
