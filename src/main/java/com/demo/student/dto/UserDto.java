package com.demo.student.dto;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UserDto {

	private int userId;
	@NotEmpty(message="Enter first Name")
	@Size(min=2,message="Enter min 2 characters")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid input")
	private String firstName;
	@NotEmpty(message="Enter last Name")
	@Size(min=2,message="Enter min 2 characters")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid input")
	private String lastName;
	@NotEmpty(message="Enter email")
	@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Invalid email address")
	private String email;
	@NotEmpty(message="Enter password")
	@Size(min=2,message="Enter min 2 characters")
	private String password;
	private String role;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
	
	

}
