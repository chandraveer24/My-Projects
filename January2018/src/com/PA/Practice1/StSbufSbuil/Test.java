package com.PA.Practice1.StSbufSbuil;

public class Test {

	public static void main(String[] args) {

		String s = "Chandu";
		long start = System.currentTimeMillis();

		for (int i = 0; i < 1000; i++)
			s = s + i;

		long end = System.currentTimeMillis();
		System.out.println("String::::::" + (end - start));

		StringBuilder sb = new StringBuilder("Chandu");

		long start1 = System.currentTimeMillis();

		for (int i = 0; i < 1000; i++)
			sb.append(i);

		long end1 = System.currentTimeMillis();
		System.out.println("StringBuilder:::::::" + (end1 - start1));

		StringBuffer sb1 = new StringBuffer("Chandu");

		long start2 = System.currentTimeMillis();

		for (int i = 0; i < 1000; i++)
			sb1.append(i);

		long end2 = System.currentTimeMillis();
		System.out.println("StringBuffer:::::::" + (end2 - start2));
	}

}
