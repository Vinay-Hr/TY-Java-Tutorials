package com.te.oops;

public class MainClass {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		System.out.println(a.i);
		System.out.println("-------------");

		a = new B();
		a.m1();
		System.out.println(a.i);
		System.out.println("-------------");
		
		a = new C();
		a.m1();
		System.out.println(a.i);
	}

}
