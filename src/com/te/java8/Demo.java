package com.te.java8;

public class Demo {
	
	public static void m1() {
		System.out.println("Non Static Method Referencing");
	}
	
	public static void main(String [] args) {
		Reference reference = Demo :: m1;
		reference.stuff();
	  
}
}
 