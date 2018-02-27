package org.PA.Collections;

//import org.PA.Constants.ApplicationConstants;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("collections.xml");
		
		Employee e=  context.getBean(Employee.class);
		
		System.out.println(e.getLocations());
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
