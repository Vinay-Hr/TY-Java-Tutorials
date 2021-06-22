package com.te.game.GuesserGameAssignment3;

public class Player3 extends GuesserMain{

//	public int Player3() {
//		int min=1;
//		int max=20;
//		System.out.println("Player3 Random Number : ");
//		int a = (int)(Math.random()*(max-min+1)+min);
//		System.out.println(a);
//		return a;
//	}

	public boolean Play3() {
		int arr[] = {3,6,4,9,12,15,19,23,27,32,37,42,47};
		boolean test=false;
		
		for (int element : arr) {
		    if (element == num) {
		        test = true;
		        System.out.println("Player 3 is Right");
		        break;
		    }
		    }
		return test;
	}	
}
