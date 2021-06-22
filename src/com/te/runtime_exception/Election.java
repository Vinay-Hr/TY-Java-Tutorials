package com.te.runtime_exception;

public class Election {
	
	public void vote(int age) {
		 if (age<18) {
			 
			 throw new AgeValidatorException("You are not eligible to vote.");
		 }else {
			 System.out.println("Your vote has been successfully casted");
		 }
	}

}
