package com.PA;

public class NoInstanceInitializer {

	
	{
		System.out.println("1");
	}
	
	
	static
	{
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		
		System.out.println("3");

	}


}
