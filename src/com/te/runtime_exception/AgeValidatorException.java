package com.te.runtime_exception;

public class AgeValidatorException extends RuntimeException {
	
	String message;

	public AgeValidatorException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
	

}
