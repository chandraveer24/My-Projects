package com.PA.Queries;

//import java.util.Iterator;
//import java.util.Iterator;
//import java.util.List;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;

import com.PA.Interceptors.StudentInterceptor;
import com.PA.Pojo.Student;
import com.PA.util.HibernateUtil;

public class StudentInterceptorMain {

	public static void main(String[] args) {
		System.out.println("Entered Main");
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session session=sf.withOptions().interceptor(new StudentInterceptor()).openSession();
		
		//Student s=new Student();
		//Student s=new Student();
//		Transaction tran=
		//session.beginTransaction();
		Student s=session.load(Student.class, 17);
        session.delete(s);
        System.out.println("After Delete");
        //session.flush();
        //tran.commit();
        session.close();
        sf.close();

	}

}
