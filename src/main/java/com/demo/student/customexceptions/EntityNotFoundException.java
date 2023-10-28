package com.demo.student.customexceptions;

public class EntityNotFoundException extends RuntimeException {
	
	public EntityNotFoundException() {
		
	}
	
	
	public EntityNotFoundException(String msg) {
		super(msg);
	}

}
