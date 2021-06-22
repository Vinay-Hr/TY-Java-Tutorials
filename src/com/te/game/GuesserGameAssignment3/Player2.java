package com.te.game.GuesserGameAssignment3;

public class Player2 extends GuesserMain{

//	public int Player2() {
//		int min =1;
//		int max =20;
//		System.out.println("Player2 Random Number : ");
//		int a = (int)(Math.random()*(max-min+1)+min);
//		System.out.println(a);
//		return a;
//	}
	
	public boolean Play2() {
		int arr[] = {2,5,8,9,11,14,18,22,26,31,36,41,46};
		boolean test=false;
		
		for (int element : arr) {
		    if (element == num) {
		        test = true;
		        System.out.println("Player2 is Right");
		        break;
		    }
		    }
		return test;
	}	
}
