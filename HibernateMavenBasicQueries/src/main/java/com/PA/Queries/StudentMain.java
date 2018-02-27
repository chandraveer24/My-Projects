package com.PA.Queries;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.PA.Pojo.Student;
import com.PA.util.HibernateUtil;

public class StudentMain {
	
	public static void insertStudent()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session s=sf.openSession();

//		s.beginTransaction();
	
		Student student=new Student();
		student.setMarks(25);
		student.setName("Harsha");
	
		Integer i=(Integer) s.save(student);//for inserting
		
		System.out.println(i);
		s.close();
		sf.close();	
	}
	
	public static void updateStudent()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session s=sf.openSession();
		
		Student student = (Student) s.load(Student.class, 17);//retrieve
		student.setName("james");
		
		Transaction tx=s.beginTransaction();
		s.update(student);//updating student
		tx.commit();
		
		s.close();
		sf.close();	
		
	}
	
	public static void deleteStudent()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session s=sf.openSession();
		
		Student student = (Student) s.load(Student.class, 18);//retrieve
		Transaction tx=s.beginTransaction();
		s.delete(student);//deleting student
		tx.commit();
		
		s.close();
		sf.close();	
		
	}

	public static void main(String[] args) {


		deleteStudent();
	}

}
