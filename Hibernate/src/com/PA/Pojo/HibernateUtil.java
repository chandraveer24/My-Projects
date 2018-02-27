package com.PA.Pojo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory=null;

	private HibernateUtil()
	{
		//singleton
	}
	
	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();

		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}

	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null)
		{
			sessionFactory=buildSessionFactory();
		}
		return sessionFactory;
	}
	
	public static void shutdown()
	{
		getSessionFactory().close();
	}

}
