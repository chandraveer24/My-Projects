package org.PA.Injecting.Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Helper {

 public static void main(String[] args) {
	
	 ApplicationContext c=new ClassPathXmlApplicationContext("SpringConfig.xml");
	 
	 Emoloyee e= (Emoloyee) c.getBean("employeeBean");
	 
	 e.display();
	 
	 ((ClassPathXmlApplicationContext)c).close();
}
}
