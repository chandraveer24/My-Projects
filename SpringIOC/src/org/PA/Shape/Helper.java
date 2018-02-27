package org.PA.Shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Helper {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		ShapeCreator sc= (ShapeCreator) c.getBean("shapeBean");
		
		sc.display();
		
		((ClassPathXmlApplicationContext)c).close();
	}
}

