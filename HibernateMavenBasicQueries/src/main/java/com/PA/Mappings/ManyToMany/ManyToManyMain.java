package com.PA.Mappings.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.PA.util.HibernateUtil;

public class ManyToManyMain {
	
	public static void usingReviewer()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Reviewer r=new Reviewer();
		r.setReviewer_name("Abhinav");
		
		List<Task> tasks=new ArrayList<>();
		Task t1=new Task();
		t1.setTask_name("Mailing");
		
		Task t2=new Task();
		t2.setTask_name("Mathematics");
		
		tasks.add(t1);
		tasks.add(t2);
		
		r.setTasks(tasks);
		
//		r.getTasks().add(t1);Without List we can do this way
//		r.getTasks().add(t2);See many to one main
		
		Transaction t=session.beginTransaction();
		session.save(r);
		
		session.flush();
		t.commit();
		session.close();
		sf.close();

	}

	public static void usingTask()
	{
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.openSession();
		
		Task t1=new Task();
		t1.setTask_name("Java");
		
		List<Reviewer> reviewers =new ArrayList<>();
		Reviewer r=new Reviewer();
		r.setReviewer_name("Mounuika");
		
		Reviewer r1=new Reviewer();
		r.setReviewer_name("Chandraveer");
		
		Reviewer r2=new Reviewer();
		r.setReviewer_name("Abhinav");
		
		reviewers.add(r);
		reviewers.add(r1);
		reviewers.add(r2);
		
		Transaction t=session.beginTransaction();
		session.save(t1);
		
		session.flush();
		t.commit();
		session.close();
		sf.close();

	}
	public static void main(String[] args) {
		
		usingTask();
	}

}
