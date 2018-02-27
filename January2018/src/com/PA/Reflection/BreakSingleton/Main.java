package com.PA.Reflection.BreakSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class c=Singleton.class;//For getting meta data of singleton class
		
		Singleton instance1=Singleton.singleInstance;
		Singleton instance2=null;
		
		Constructor[] declaredConstructors = c.getDeclaredConstructors();
		
		for (Constructor constructor : declaredConstructors) {
			constructor.setAccessible(true);
			instance2=(Singleton) constructor.newInstance();
		}
		
		System.out.println(instance1);
		System.out.println(instance2);
	}

}
