package com.demo.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contactus")
public class ContactUs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull(message = "Enter first Name")
	@Size(min = 2, message = "enter min 2 characters")
	private String fname;
	@NotNull(message = "Enter Last Name")
	@Size(min = 2, message = "enter min 2 characters")
	private String lname;
	@NotNull(message = "Enter email Name")
	@Size(min = 2, message = "enter min 2 characters")
	private String email;
	@NotNull(message = "Enter subject Name")
	@Size(min = 2, message = "enter min 2 characters")
	private String subject;
	@NotNull(message = "Enter message Name")
	@Size(min = 2, message = "enter min 2 characters")
	private String message;
	private String status;
	
	

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

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


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	

}
