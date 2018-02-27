package com.PA.inheritance.hasA;

public class PersonMain {

	public static void main(String[] args) {
		
		Address a=new Address();//has-A relationship
		
		Person p=new Employee();//Is-A relationship
		
		p.setName("Chandraveer");
		String s=p.getAddress(a.getAddress());
		System.out.println(p.getName());
		System.out.println(s);
	}
}
