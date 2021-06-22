package com.te.oops;

public class DogMain {

	public static void main(String[] args) {
		
		Dog dog = new Labrodor();
		dog.bark();
		dog.eat();
		dog.poop();

		dog = new Rotweiler();
		dog.bark();
		dog.eat();
		dog.poop();
	}

}
