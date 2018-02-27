package org.PA.Inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("inheritance.xml");
		
		Person e= c.getBean(Employee.class);
		Person c1= c.getBean(Contractor.class);
		
		System.out.println(e.getFirstName());
		System.out.println(e.getClass());
		System.out.println(c1.getFirstName());
		
		((ClassPathXmlApplicationContext)c).close();
	}

}
