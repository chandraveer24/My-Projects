package com.PA.Queries;

//import org.hibernate.Criteria;

//import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.PA.Pojo.*;
import com.PA.util.HibernateUtil;

public class AuthorOptimisticLockingMain {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.sessionFactory;
		Session s = sf.openSession();

		Transaction tran = s.beginTransaction();
		
		
		Author a= s.load(Author.class, 3);
		a.setLastName("Lingam");
		
		s.update(a);

		s.flush();
		tran.commit();
		s.close();
		sf.close();
	}
}
