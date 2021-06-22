package com.te.runtime_exception;

import java.util.Scanner;

public class ElectionMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int a=sc.nextInt();
		
		Election election=new Election();
		try {
			election.vote(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
