package org.PA.SpringBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Restaurant r = context.getBean(Restaurant.class);
		System.out.println(r);
		r.greetCustomer();
		((ClassPathXmlApplicationContext)context).close();
	}

}
