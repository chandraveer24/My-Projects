package com.PA.Practice1.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

public class Important {
	@SuppressWarnings("resource")
	public void m4() {
		try {
			@SuppressWarnings("unused")
			FileReader fr = new FileReader(new File("hi"));
			// System.out.println("method1");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		}
		System.out.println("method4");
	}

	public void m3() {
		// System.out.println("method3");
		m4();
		System.out.println("method3");
	}

	public void m2() {
		System.out.println("method2");
		m3();
		System.out.println("metod2");
	}

	public void m1() throws InterruptedException {
		// FileReader fr=new FileReader(new File("hi"));
		TimeUnit.SECONDS.sleep(1);
		m2();
		
	}

	public static void main(String[] args) throws InterruptedException  {
		Important ep = new Important();
		ep.m1();
		System.out.println("Appreciate it!");

	}

}
