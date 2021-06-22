package com.te.demo;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Year");
		int a = scanner.nextInt();
		if((a%400==0) || (a%4==0 && a%100!=0) )
		{
			System.out.println("Its a Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
