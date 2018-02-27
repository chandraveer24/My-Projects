package com.PA.OverLoading;

  class  Main1 {

	 void a()
	{
		System.out.println("I am in Test");
	}
	
	 void a(final int a, int b)
	{
		 b=4;
		System.out.println(a+b);
	}
	
	void a(float a, float b)
	{
		
	}
}	


class Test1 extends Main1
{
	void a()
	{
		System.out.println("I am in Test1");
	}
}

class Main
{
	public static void main(String[] args) {
		
		Main1 t1=new Test1();
		t1.a();
		Main1 m=new Main1();
		m.a(1, 3);
	}

}