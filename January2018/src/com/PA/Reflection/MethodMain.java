package com.PA.Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodMain {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Class c=Methods.class;
		
		Method[] declaredMethods = c.getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			
			System.out.println("Name::"+method.getName());
			System.out.println("Return Type::"+method.getReturnType().getName());
			
			int i=method.getModifiers();
			System.out.println("Access Modifiers::"+Modifier.toString(i));
			
			Class[] parameterTypes = method.getParameterTypes();
			System.out.print("ParaMeter Types::");
			for (Class class1 : parameterTypes) {
				
				System.out.print(class1.getName()+ "  ");
			}
			System.out.println();
			
			Class[] exceptionTypes = method.getExceptionTypes();
			System.out.print("Exception Types::");
			for (Class class1 : exceptionTypes) {
				
				System.out.print(class1.getName()+"  ");
			}
			System.out.println();
			System.out.println("------------------------");
		}
	}
}
