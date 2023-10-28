package com.demo.student.entity;

import org.springframework.beans.factory.annotation.Value;

public class Hello {
	
	private String database;
	private String hostname;
	private String username;
	
	
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
}
