package com.pathasoft.exception;

public class ApplicationException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	public ApplicationException(String message) {

		this.message = message;
		
	}
	
	@Override
	public String getMessage() {
		
		return message;
	}

}