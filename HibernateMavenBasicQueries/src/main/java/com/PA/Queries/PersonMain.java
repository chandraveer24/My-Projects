package com.PA.Queries;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.PA.Pojo.Inheritance.Joined.*;
import com.PA.util.HibernateUtil;

public class PersonMain {

	public static void main(String[] args) {

//		Student s1=new Student();
//		s1.setFirstName("Chandraveer");
//		s1.setLastName("Paumarthy");
//		s1.setInstructor("Appi");
//		s1.setSpecialization("Masters");
		
//		Teacher t1=new Teacher();
//		t1.setFirstName("Nemo");
//		t1.setLastName("It");
//		t1.setSalary(1000);
//		t1.setSubject("Java");
		
		
		Person p=new Person();
		p.setFirstName("Abhinv");
		p.setLastName("Pasumarthy");
		
		SessionFactory sf = HibernateUtil.sessionFactory;
		Session s = sf.openSession();
		
		s.beginTransaction();
		s.save(p);
		
		s.flush();
		s.close();
		sf.close();
	}

}
