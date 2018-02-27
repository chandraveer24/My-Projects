package org.PA.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Helper {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("autoWiring.xml");
		
		ShapeCreator sc= (ShapeCreator) c.getBean(ShapeCreator.class);
		sc.display();
		Circle cir=sc.getCircle();
		System.out.println(cir);
		cir.draw();
		
		((ClassPathXmlApplicationContext)c).close();
	}
}

