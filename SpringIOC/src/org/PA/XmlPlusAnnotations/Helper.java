package org.PA.XmlPlusAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Helper {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("XmlPlusAnnatation.xml");
		
		ShapeCreator sc= (ShapeCreator) c.getBean(ShapeCreator.class);
		Shape s=sc.getShape();
		s.draw();
		
		ShapeCreator1 sc1= (ShapeCreator1) c.getBean(ShapeCreator1.class);
		Shape s1=sc1.getShape();
		s1.draw();
		
		((ClassPathXmlApplicationContext)c).close();
	}
}

