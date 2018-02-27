package com.PA.CompositeKey;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.PA.util.HibernateUtil;

public class CompositeMain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		CompositeKey ck=new CompositeKey();
		ck.setLocation("Pennsylvania");
		
		CompositeId cid=new CompositeId();
		cid.setFirstname("Chandraveer");
		cid.setLastname("Pasumarthy");
		cid.setPhoneNo("618-303-6890");
		
		ck.setId(cid);
		
		Transaction t=session.beginTransaction();
		session.save(ck);
		
		session.flush();
		t.commit();
		session.close();
		sf.close();
	}

}
