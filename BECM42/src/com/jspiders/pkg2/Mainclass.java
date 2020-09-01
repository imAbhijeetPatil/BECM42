package com.jspiders.pkg2;

import com.jspiders.pkg1.Sample;
import com.jspiders.pkg3.Demo;

public class Mainclass 
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");

		Sample.display();

		Sample s1 = new Sample();
		s1.view();

		com.jspiders.pkg3.Sample.display();
		com.jspiders.pkg3.Sample s2 = new com.jspiders.pkg3.Sample();
		s2.view();

		System.out.println("Program ends...");

		// com.jspiders.pkg1.Sample
	}
}
