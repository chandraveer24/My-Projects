package org.PA.Injecting.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Student s= (Student) c.getBean("studentBean");
		
		s.display();
		
		((ClassPathXmlApplicationContext)c).close();
	}
}
