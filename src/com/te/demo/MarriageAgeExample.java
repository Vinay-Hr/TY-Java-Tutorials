package com.te.demo;
import java.util.Scanner;
public class MarriageAgeExample {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=scanner.nextInt();
			if (age<=35 & age>=27)
			{
				System.out.println("Elgible");
			}
			else
				{
				System.out.println("Not Elgible");
				}
			
			//OR
			
			if (age>=27) 
			{
				if (age<=35) 
				{
					System.out.println("Elgible");
				}
				else {
					System.out.println("No use");
				}
			}
			else {
				System.out.println("Not Elgible");
			}
	
	}
			
}

