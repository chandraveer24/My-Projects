package org.PA.SpringBeanLifeCycle;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext c=new ClassPathXmlApplicationContext("lifecycle.xml");
		
		Author a= c.getBean(Author.class);
		
		System.out.println(a);
		System.out.println(a.getName());
		
		((ClassPathXmlApplicationContext)c).close();
		//It calls destroy method
	}

}
