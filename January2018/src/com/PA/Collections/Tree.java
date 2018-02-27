package com.PA.Collections;

import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
	
		TreeSet<Student> t=new TreeSet<>();
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		System.out.println(t);
		

	}

}
