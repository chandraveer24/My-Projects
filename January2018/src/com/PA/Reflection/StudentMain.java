package com.PA.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class StudentMain {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		Student s=new Student();
		Class c = s.getClass();
		
		Field[] declaredFields = c.getDeclaredFields();
		
		for (Field field : declaredFields) {
			System.out.println("Name:"+field.getName());
			System.out.println("DataType:"+field.getType().getName());
			int i=field.getModifiers();
			System.out.println("Access Modifiers are:"+Modifier.toString(i));
			System.out.println("Value:"+ field.get(field));
			System.out.println("---------------------------");
		}
	}

}
