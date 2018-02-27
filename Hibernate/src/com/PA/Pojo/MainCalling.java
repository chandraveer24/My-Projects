package com.PA.Pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainCalling {

	public static void main(String[] args) {

		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Student s=new Student();
			s.setName("Mounika");
			s.setMarks(25);
			
			Integer i=(Integer) session.save(s);
			System.out.println(i);
				
		}
		
		catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        	//session.beginTransaction().commit();
            session.flush();
            session.close();
        }
		//System.out.println(s.getName());
		
		
	}

}
