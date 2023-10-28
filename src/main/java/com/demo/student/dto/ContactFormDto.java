package com.demo.student.dto;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class ContactFormDto {

	@NotEmpty(message = "Enter first Name")
	@Size(min = 2, message = "Enter min 2 characters")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid input")
	private String fname;
	@NotEmpty(message = "Enter Last Name")
	@Size(min = 2, message = "Enter min 2 characters")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid input")
	private String lname;
	@NotEmpty(message = "Enter email Name")
	@Size(min = 2, message = "Enter min 2 characters")
	@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Invalid email address")
	private String email;
	@NotEmpty(message = "Enter subject Name")
	@Size(min = 2, message = "Enter min 2 characters")
	private String subject;
	@NotEmpty(message = "Enter message here")
	@Size(min = 2, message = "Enter min 2 characters")
	private String message;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
