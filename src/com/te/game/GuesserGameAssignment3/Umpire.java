package com.te.game.GuesserGameAssignment3;

public class Umpire extends GuesserMain{

	public boolean Ump()
	{
		boolean test = false;
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		Player3 p3 = new Player3();
		
//		if(p1.Play1()==true)
//		{
//			if(p2.Play2()==true)
//			{
//				if(p3.Play3()==true) {
//					
//				}
//			}
//		}
//		
		if ((p1.Play1() && p2.Play2()==true) && (p3.Play3()==true)) {
			System.out.println("All Players guessed right !! Match is Tied");
			test = false;
		}
		else if ((p1.Play1() || p2.Play2()!=true) && (p3.Play3()==false)) {
			System.out.println("All Guesses Failed !! Play Again");
			test= true;
		}
		return test;
	}
}
