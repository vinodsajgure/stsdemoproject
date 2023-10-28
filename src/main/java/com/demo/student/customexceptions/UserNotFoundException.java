package com.demo.student.customexceptions;

public class UserNotFoundException extends Exception {
	
	public UserNotFoundException() {
		
	}


	public UserNotFoundException(String message) {
		super(message);

	}
}