package org.PA.Constants;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("constants.xml");
		
		Employee e=  c.getBean(Employee.class);
		System.out.println(e);
		e.setName("Chandraveer");
		System.out.println(e.getName());
		System.out.println(e.getCompanyName());
		
		Employee e1= c.getBean(Employee.class);
		System.out.println(e1);
		System.out.println(e1.getName());//We will get null because we have used prototype scope
		System.out.println(e1.getCompanyName());
		
		((ClassPathXmlApplicationContext)c).close();
		
	}
}
