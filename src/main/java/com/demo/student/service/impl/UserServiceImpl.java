package com.demo.student.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.student.customexceptions.UserNotFoundException;
import com.demo.student.dao.UserDao;
import com.demo.student.entity.Role;
import com.demo.student.entity.User;
import com.demo.student.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public List<User> getAll() {

		return dao.findAll();
	}

	@Override
	public User getByEmail(String email) {

		return dao.findByEmail(email);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = dao.findByEmail(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("Invalid Username or Password...");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesAndAuthorities(user));
	}
	
	
	
	private Collection<? extends GrantedAuthority> mapRolesAndAuthorities(User user) {
		List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<SimpleGrantedAuthority>();	
		
		for (Role role : user.getRoles()) {
			grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole()));
		}
		return grantedAuthorities;
	}

}
