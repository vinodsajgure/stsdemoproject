package com.demo.student.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.demo.student.entity.User;

public interface UserService extends UserDetailsService{
	
	public List<User> getAll();
	public User getByEmail(String email);

}
