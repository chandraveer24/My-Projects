package com.PA.Practice1.StringBuffer;

public class Test {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer("Chandu");
		System.out.println(sb1.capacity());
		
		StringBuffer sb2=new StringBuffer(30);
		System.out.println(sb2.capacity());
		
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());

	}

}
