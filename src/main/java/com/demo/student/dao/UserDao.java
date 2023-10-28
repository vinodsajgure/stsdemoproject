package com.demo.student.dao;

import java.util.List;

import com.demo.student.entity.User;

public interface UserDao {
	
	public List<User> findAll();
	public User findByEmail(String email);

}
