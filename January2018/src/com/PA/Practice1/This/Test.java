package com.PA.Practice1.This;

public class Test {
	
	//int i;
	static void last(Test t)
	{
		//System.out.println(i);
		System.out.println("I am Called");
	}
	 void callMe()
	{
		last(this);
	}
	public static void main(String[] args) {
		//System.out.println(i);
		Test t1=new Test();
		t1.callMe();
	}
}
