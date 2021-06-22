package com.te.custom_exception;

public class InsufficientBalanceException extends Exception{
	
	String message;

	public InsufficientBalanceException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		
		return this.message;
	}

	
//	alt+shift+s
//	ctrl+shift+s
//	alt+shift+z
//	
	

}
