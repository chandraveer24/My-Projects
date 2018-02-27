package org.PA.SpringJdbc;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("SpringJdbc.xml");
		
		ClerkDao dao=c.getBean(ClerkDao.class);
		
		dao.createClerk(new Clerk("888-555-8887", "Chandraveer", new Date(), new Date(), true));
		
		((ClassPathXmlApplicationContext)c).close();
	}

}
