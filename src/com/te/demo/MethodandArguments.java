package com.te.demo;

public class MethodandArguments {

	

		public static void m1(int a)
		{
			System.out.println("1st M1");
		}
		
		public static void m1(int a, int b)
		{
			System.out.println("2nd M1");
		}
		
		public static void m1(int...a)
		{
			System.out.println("var args m1");
		}


}
