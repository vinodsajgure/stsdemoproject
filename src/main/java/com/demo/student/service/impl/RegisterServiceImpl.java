package com.demo.student.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.student.dao.RegisterDao;
import com.demo.student.dto.UserDto;
import com.demo.student.entity.Role;
import com.demo.student.entity.User;
import com.demo.student.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterDao dao;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Override
	public void registerUser(UserDto userdto) {
		User user = new User();
		user.setFirstName(userdto.getFirstName());
		user.setLastName(userdto.getLastName());
		user.setEmail(userdto.getEmail());
		user.setPassword(encoder.encode(userdto.getPassword()));
		user.setRoles(getRoles(userdto.getRole(),user)); 
		dao.registerUser(user);
		
	}

	private Set<Role> getRoles(String dtoRole, User user){
		Set<Role> roles = new HashSet<>();
	
		Role role = new Role();
		if(dtoRole==null) {
			role.setRole("USER");
		}
		else {
			role.setRole(dtoRole);
		}
		role.setUser(user);
		
		roles.add(role);
		return roles;
	}

}
