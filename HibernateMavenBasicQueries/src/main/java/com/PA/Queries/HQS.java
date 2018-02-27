package com.PA.Queries;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.PA.Pojo.Clerk;
import com.PA.util.HibernateUtil;

public class HQS {
	
	@SuppressWarnings("unchecked")
	public static void retrieve()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Query query=session.createQuery("from Clerk");
		List<Clerk> clerks = query.getResultList();
		for (Clerk clerk : clerks) {
			System.out.println(clerk.getSsn());
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void retrieveUsingWhere()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Query query=session.createQuery("from Clerk where ssn= :id");
		query.setParameter("id", "618-303-6890");
		List<Clerk> clerk=query.getResultList();
		for (Clerk clerk2 : clerk) {
			System.out.print(clerk2.getName()+"\t");
			System.out.print(clerk2.getSsn()+"\t");
			System.out.println(clerk2.getJoinedDate());
		}
	}
	
	public static void delete()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Transaction tran=session.beginTransaction();
		String delete= "DELETE FROM Clerk "  + 
	             	   "WHERE ssn = :id";
		
		Query query=session.createQuery(delete);
		query.setParameter("id", "000-303-6450");

		int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
		tran.commit();
	}
	
	public static void main(String[] args) {
		
//		retrieve();
//		retrieveUsingWhere();
//		delete();
	}

}
