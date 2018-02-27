package org.PA.ProfileGenerator;

import org.PA.JavaBasedConfiguration.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "dev");
		ApplicationContext c = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		((AnnotationConfigApplicationContext) c).close();

	}

}
