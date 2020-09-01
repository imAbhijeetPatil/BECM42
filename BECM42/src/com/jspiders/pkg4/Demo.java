package com.jspiders.pkg4;

public class Demo 
{
	public    int    v1 = 100;
	protected double v2 = 2.34;
	          long v3 = 776816897698686l;//default
	private   String v4 = "hello";
	
	public void test1()
	{
	  System.out.println("this is public-test1()");
	}
	
	protected void test2()
	{
	  System.out.println("this is protected-test2()");
	}
	
	void test3()
	{
	  System.out.println("this is pkg-level-test3()");
	}
	
	private void test4()
	{
	  System.out.println("this is private-test4()");
	}

	public static void main(String[] args) 
	{
       Demo d1 = new Demo();
       
       System.out.println(d1.v1);
       d1.test1();
       
       System.out.println(d1.v2);
       d1.test2();
       
       System.out.println(d1.v3);
       d1.test3();
       
       System.out.println(d1.v4);
       d1.test4();
	}

}


