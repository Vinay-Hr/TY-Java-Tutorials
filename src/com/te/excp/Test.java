package com.te.excp;

public class Test {
	public static void main(String [] Args) {
		
		Test.m1();
		System.out.println("Hi this is exception");
	}
	
	public static void m1() {
		
		Test.m2();
		System.out.println(10/0); //throws an exception
		System.out.println("Hi Hello how are you?");
	}
	
	public static void m2() {
		
		Test.m3();
		System.out.println("Hello");
	}
	
	public static void m3() {
		System.out.println("Welcome to Training");		
	}

}
