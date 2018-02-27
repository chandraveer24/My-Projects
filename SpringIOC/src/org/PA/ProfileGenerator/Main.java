package org.PA.ProfileGenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		System.setProperty("spring.profiles.active", "dev");
		
		ApplicationContext c=new ClassPathXmlApplicationContext("profilegenerator.xml");
		
		
		((ClassPathXmlApplicationContext)c).close();
	}

}
