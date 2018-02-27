package com.PA;

public class InstanceInitializer {

	{
		System.out.println("1");
	}
	
	public InstanceInitializer() {
		System.out.println("2");
	}
	
	static
	{
		System.out.println("3");
	}
	public static void main(String[] args) {


		@SuppressWarnings("unused")
		InstanceInitializer i=new InstanceInitializer();
		System.out.println("4");
	}

}
