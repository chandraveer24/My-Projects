package com.PA.Practice1.Exceptions;

public class Test1 {

	static Integer i;
	
	public static void main(String[] args) {
	
		System.out.println(i);//not 0 it is not primitive type
		try
		{
			System.out.println(i.compareTo(0));
		}
		catch (ArithmeticException | NullPointerException e) {
			System.out.println("Exception");
		}

	}

}
