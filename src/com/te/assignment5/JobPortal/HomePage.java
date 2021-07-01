package com.te.assignment5.JobPortal;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HomePage {

	public static void main(String[] args) {

		String email;
		String name;
		int sslc;
		int pu;
		int be;
		int exit = 0;
		Scanner sc = new Scanner(System.in);
		TreeSet<Candidate> set = new TreeSet<Candidate>();
		
		do {
			System.out.println("-------Welcome to Job Portal----------\n Enter your Choice :");
			System.out.println(" 1.Register\n 2.Login\n 3.Display\n 4.Check Eligibility\n 5.Exit\n");
			int ch = sc.nextInt();
			
			switch(ch) {
			
			case 1:
				System.out.println("Enter your Email ID :");
				email = sc.next();
				System.out.println("Enter your Name :");
				name = sc.next();
				System.out.println("Enter your 10th % :");
				sslc = sc.nextInt();
				System.out.println("Enter your 12th % :");
				pu = sc.nextInt();
				System.out.println("Enter your Eng % :");
				be = sc.nextInt();
				set.add(new Candidate(email,name,sslc,pu,be));
				break;
			
			case 2: 
				System.out.println("Enter your Email ID :");   email = sc.next();
				System.out.println("Enter your Name :");   name = sc.next();
				
				for (Candidate candidate : set) {
					if (email.equalsIgnoreCase(candidate.getEmail()) && name.equalsIgnoreCase(candidate.getName())) {
						System.out.println("Login Successfull");
					} 
					}
				
				break;
				
			case 3: 
				for (Candidate candidate : set) {
					System.out.println(candidate);
				}
				break;
				
			
			case 4: 
				for (Candidate candidate : set) {
					if(candidate.getSslc() >= 60 && candidate.getPu() >= 60 && candidate.getBe() >= 60) {
						System.out.println(candidate.getName() + " is eligible for the drive");
					}}
				break;
				
			case 5:
				System.out.println(" ThankYou :)");
				exit++;
				break;

			default:
				System.out.println("Invalid option!!");
			
			}
		}
		while (exit==0);
		}
			
}
