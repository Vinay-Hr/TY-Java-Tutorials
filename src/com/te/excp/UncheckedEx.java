package com.te.excp;

import java.util.Scanner;

public class UncheckedEx {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int n = scanner.nextInt();
		System.out.println("Enter the Denominator");
		int d = scanner.nextInt();
//		alt+shift+z
		
		try {
			int result = n / d;
			System.out.println("The Result is:"+result);
		} catch (Exception e) {
			
			System.out.println("the Denominator cannot be Zero");
		}
		
	}

}
