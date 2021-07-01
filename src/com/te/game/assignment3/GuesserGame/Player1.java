package com.te.game.assignment3.GuesserGame;

public class Player1 extends GuesserMain{

//	public int Player1() {
//		int min = 1;  
//		int max = 20;
//		System.out.println("Player1 Random Number : ");
//		int a = (int)(Math.random()*(max-min+1)+min);
//		System.out.println(a);
//		return a;
//	}
	
	public boolean Play1() {
		int arr[] = {1,4,7,9,10,13,17,21,25,30,35,40,45};
		boolean test=false;
		
		for (int element : arr) {
		    if (element == num) {
		        test = true;
		        System.out.println("Player1 is Right");
		        break;
		    }
		    }
		return test;
	}		

}