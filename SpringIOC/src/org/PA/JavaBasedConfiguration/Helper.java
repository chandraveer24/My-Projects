package org.PA.JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Helper {

	public static void main(String[] args) {
		
		ApplicationContext c=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		ShapeCreator sc= c.getBean(ShapeCreator.class);
		
		Shape s=sc.getShape();
		
		s.draw();
		
		((AnnotationConfigApplicationContext)c).close();
	}
}

