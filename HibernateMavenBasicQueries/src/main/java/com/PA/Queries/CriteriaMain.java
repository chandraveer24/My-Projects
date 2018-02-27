package com.PA.Queries;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
//import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.PA.Pojo.Student;
import com.PA.util.HibernateUtil;

public class CriteriaMain {

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void retrieve()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
		List<Student> students=criteria.list();
		for (Student student : students) {
			System.out.print(student.getName()+"\t");

		}
		
	}
	@SuppressWarnings("deprecation")
	public static void retrieveUsingRestrictions()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();

		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("name", "Abhinav"));
		criteria.add(Restrictions.gt("marks", 60));
		Student s=(Student) criteria.uniqueResult();
		System.out.println(s.getMarks());
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void retrieveUsingMultipleRestrictions()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();

		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(Restrictions.between("marks", 50, 100));
		criteria.add(Restrictions.ilike("name", "%veer"));
		
		List<Student> students=criteria.list();
		for (Student student : students) {
			System.out.println(student.getSid());
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public static void rerieveUsigProjections()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
		Criteria c1=criteria.setProjection(Projections.rowCount());
		Long count=(Long) c1.uniqueResult();
		System.out.println("Number of rows:"+count);
		
		Criteria c2=criteria.setProjection(Projections.avg("marks"));
		Double d=(Double) c2.uniqueResult();
		System.out.println("Aug is:"+d);
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void retrieveBySorting()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
		criteria.addOrder(Order.desc("name"));
		List<Student> students=criteria.list();
		for (Student student : students) {
			System.out.println(student.getName());
		}

	}
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void pagination()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
		criteria.setFirstResult(0);
		criteria.setMaxResults(3);
		List<Student> students=criteria.list();
		for (Student student : students) {
			System.out.println(student.getSid());
		}
	}
	public static void main(String[] args) {

		//retrieve();
		//retrieveUsingRestrictions();
		//retrieveUsingMultipleRestrictions();
		//rerieveUsigProjections();
		//retrieveBySorting();
		pagination();
		
	}

}
