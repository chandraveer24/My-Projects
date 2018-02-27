
package com.PA.Reflection;

import java.lang.reflect.Modifier;

public class EmployeeMain {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args)  {

		Class c;
		try {
			c = Class.forName("com.PA.Reflection.Employee");
			System.out.println("Name: "+c.getName());//Displaying name
			
			Class superClass=c.getSuperclass();
			System.out.println("Super Class Name: "+superClass.getName());//Displaying super class name
			
			System.out.println("Interfaces Lists");
			Class[] interfaces=c.getInterfaces();
			for (Class class1 : interfaces) {
				System.out.print(class1.getName()+ " ");
			}
			System.out.println();
			
			System.out.print("Modifiers are ");
			int i=c.getModifiers();
			//System.out.println(i);
			System.out.println(Modifier.toString(i));
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			System.out.println("I am in catch");
		}
		
		
	}

}
