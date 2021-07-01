package com.te.game.assignment3.GuesserGame;

import java.util.Scanner;

public class GuesserMain 
{
static int num;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean i = false;
		
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		Player3 p3 = new Player3();
		Umpire umpire = new Umpire();
		
		do {
		System.out.println("Enter a number between 1 to 50 :");
		num = sc.nextInt();
		
		}
		while(umpire.Ump()==true);
		
	}

}
