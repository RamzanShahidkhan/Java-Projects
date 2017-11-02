package com.lynda.javatraining.exception;

public class WrongFileException extends Exception {
	public static final long  serialVersionID=42L;
	
	@Override
	public String getMessage() {
		
		return "you chose wrong file jani";
	}

}
