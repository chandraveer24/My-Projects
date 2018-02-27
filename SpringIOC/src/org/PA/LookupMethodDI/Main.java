package org.PA.LookupMethodDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("LookupMethod.xml");
		
		A a=c.getBean(A.class);
		
		B b=a.getBInstance();

		b.print();
		
		((ClassPathXmlApplicationContext)c).close();
	}

}
