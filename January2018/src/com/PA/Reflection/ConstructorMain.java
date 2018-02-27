package com.PA.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorMain {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		Class c=Constructors.class;
		
		Constructor[] declaredConstructor = c.getDeclaredConstructors();
		
		for (Constructor constructor : declaredConstructor) {
			
			//constructor.se
			System.out.println("Name :"+constructor.getName());
			
			int i=constructor.getModifiers();
			System.out.println("Access Modifier :"+Modifier.toString(i));
			
			Class[] parameterTypes = constructor.getParameterTypes();
			System.out.print("Parameters :");
			for (Class class1 : parameterTypes) {
				
				System.out.print(class1.getName()+ "  ");
			}
			System.out.println();
			
			Class[] exceptionTypes = constructor.getExceptionTypes();
			System.out.print("Exceptions :");
			for (Class class1 : exceptionTypes) {
				
				System.out.print(class1.getName()+ "  ");
			}
			System.out.println();
			System.out.println("----------------------");
		}
	}

}
