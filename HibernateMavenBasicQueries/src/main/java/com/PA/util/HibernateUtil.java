package com.PA.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.PA.CompositeKey.CompositeId;
import com.PA.CompositeKey.CompositeKey;
import com.PA.Mappings.ManyToMany.Reviewer;
import com.PA.Mappings.ManyToMany.Task;
import com.PA.Mappings.ManyToOne.Customer;
import com.PA.Mappings.ManyToOne.Orders;
import com.PA.Mappings.OneToOne.Address;
import com.PA.Mappings.OneToOne.Employee;
import com.PA.Pojo.Author;
import com.PA.Pojo.Clerk;
import com.PA.Pojo.Student;
import com.PA.Pojo.Inheritance.Joined.*;
import com.PA.Pojo.Inheritance.Single.CD;
import com.PA.Pojo.Inheritance.Single.InernationalCD;
import com.PA.Pojo.Inheritance.Single.SpecificRegionCD;

public class HibernateUtil {

	public static SessionFactory sessionFactory;
	
	static {
		Configuration c=new Configuration();
		c.configure();
		
		c.addPackage("com.PA.Pojo").addAnnotatedClass(Student.class);
		c.addPackage("com.PA.Pojo").addAnnotatedClass(Clerk.class);
		c.addPackage("com.PA.Pojo").addAnnotatedClass(Author.class);
		
		c.addPackage("com.PA.Pojo.Inheritance.Single").addAnnotatedClass(CD.class);
		c.addPackage("com.PA.Pojo.Inheritance.Single").addAnnotatedClass(InernationalCD.class);
		c.addPackage("com.PA.Pojo.Inheritance.Single").addAnnotatedClass(SpecificRegionCD.class);
		
		c.addPackage("com.PA.Pojo.Inheritance.Joined").addAnnotatedClass(Person.class);
		c.addPackage("com.PA.Pojo.Inheritance.Joined").addAnnotatedClass(com.PA.Pojo.Inheritance.Joined.Student.class);
		c.addPackage("com.PA.Pojo.Inheritance.Joined").addAnnotatedClass(Teacher.class);
		
		c.addPackage("com.PA.Mappings.OneToOne").addAnnotatedClass(Address.class);
		c.addPackage("com.PA.Mappings.OneToOne").addAnnotatedClass(Employee.class);
		
		c.addPackage("com.PA.Mappings.ManyToOne").addAnnotatedClass(Customer.class);
		c.addPackage("com.PA.Mappings.ManyToOne").addAnnotatedClass(Orders.class);
		
		c.addPackage("com.PA.CompositeKey").addAnnotatedClass(CompositeKey.class);
		c.addPackage("com.PA.CompositeKey").addAnnotatedClass(CompositeId.class);
		
		c.addPackage("com.PA.Mappings.ManyToMany").addAnnotatedClass(Reviewer.class);
		c.addPackage("com.PA.Mappings.ManyToMany").addAnnotatedClass(Task.class);
		
		
		StandardServiceRegistryBuilder s=new StandardServiceRegistryBuilder().applySettings(c.getProperties());
		sessionFactory=c.buildSessionFactory(s.build());
	}
	

}
