package com.te.oops.assignment2;

public class Main {

	public static void main(String[] args) {
		
//		Mind mind = new Player1();
//		mind.read();
//		mind.speak();
//		mind.think();
//		System.out.println("-------------------------");
//		mind = new Player2();
//		mind.read();
//		mind.speak();
//		mind.think();
//		System.out.println("-------------------------");
//		Body body = new Player3();
//		body.walk();
//		body.run();
//		body.sleep();
//		body.breathe();
		
		HumanBeing hb = new HumanBeing();
		hb.Human(new Player1());
		System.out.println("-------------------------");
		hb.Human(new Player2());
		System.out.println("-------------------------");
		hb.Human(new Player3());
		
	}

}
