package com.PA.Queries;

import org.hibernate.Criteria;

//import javax.validation.constraints.Null;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import com.PA.Pojo.Author;
import com.PA.util.HibernateUtil;

public class FirstLevelCache {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.sessionFactory;
		Session s = sf.openSession();

		Transaction tran = s.beginTransaction();
		
		Criteria criteria=s.createCriteria(Author.class);
		criteria.setProjection(Projections.rowCount());
		Long count=(Long) criteria.uniqueResult();
		int i=1;
		while(true)
		{
			Author a= s.load(Author.class, i);
			if(i>count)
			{
				break;
			}
			System.out.println(a.getLastName());
			i++;
		}
		
		System.out.println("-------------------------------");
		System.out.println("Using get()");
		int j=1;
		while(true)
		{
			Author a= s.get(Author.class, j);
			if(a==null)
			{
				break;
			}
			System.out.println(a.getFirstName());
			j++;
		}

		System.out.println("--------------------------");
		
		System.out.println("First level Cache Example");
		
		Author a1= s.load(Author.class, 3);
		System.out.println(a1.getFirstName());
		
		Author a2= s.load(Author.class, 3);
		System.out.println(a2.getFirstName());
		
		s.flush();
		tran.commit();
		s.close();
		sf.close();
	}

}
