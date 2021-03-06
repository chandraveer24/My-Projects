package com.PA.Queries;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.PA.util.HibernateUtil;

public class NamedNativeQuery {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session = sf.openSession();
		
		Query query=session.createNamedQuery("retrieveClerks");
		List<com.PA.Pojo.Clerk> students = query.getResultList();
		
		for (com.PA.Pojo.Clerk student : students) {
			System.out.print(student.getName()+"\t");
			System.out.print(student.getSsn()+"\t");
		}
		
	}

}
