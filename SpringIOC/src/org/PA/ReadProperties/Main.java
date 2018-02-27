package org.PA.ReadProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("PropertyReader.xml");
		
		Author a= (Author) context.getBean("authorObj");
		
		System.out.println(a.getTitle());
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
