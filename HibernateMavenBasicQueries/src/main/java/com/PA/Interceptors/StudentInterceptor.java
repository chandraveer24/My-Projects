package com.PA.Interceptors;

import java.io.Serializable;

//import javax.persistence.Entity;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.PA.Pojo.Student;

public class StudentInterceptor extends EmptyInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		if(entity instanceof Student)
		System.out.println("On Delete Interceptor is invoked");
	}

	@Override
	public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		System.out.println("In Onload");
		return super.onLoad(entity, id, state, propertyNames, types);
	}
}
