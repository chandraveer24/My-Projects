package org.PA.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Helper {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Restaurant r= (Restaurant) c.getBean("restBeanCollection");
		
		r.display();
		
		((ClassPathXmlApplicationContext)c).close();
	}

}
