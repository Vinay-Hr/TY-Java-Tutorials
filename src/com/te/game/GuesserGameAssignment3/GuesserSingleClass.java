package com.te.game.GuesserGameAssignment3;

import java.util.Scanner;
import java.lang.Math;

public class GuesserSingleClass {

	static int min= 1; static int max= 10;
	static int value = 0;
	
	public static int Player1() {
		System.out.println("Player1 Random Number : ");
		int a = (int)(Math.random()*(max-min+1)+min);
		System.out.println(a);
		return a;
	}
	
	public static int Player2() {
		System.out.println("Player2 Random Number : ");
		int a = (int)(Math.random()*(max-min+1)+min);
		System.out.println(a);
		return a;
	}
	
	public static int Player3() {
		System.out.println("Player3 Random Number : ");
		int a = (int)(Math.random()*(max-min+1)+min);
		System.out.println(a);
		return a;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean i = false;
		do {
		System.out.println("Enter a number between 1 to 10 :");
		int num = sc.nextInt();
		
		if (Player1()==num) {
			System.out.println("Player 1 is Winner !!");
			i=true;
		}
		else if (Player2()==num) {
			System.out.println("Player 2 is the Winner !!");
			i=true;
		}
		else if (Player3()==num) {
			System.out.println("Player 3 is the Winner !!");
			i=true;
		}
		}
		while(i==false);
	}

}


