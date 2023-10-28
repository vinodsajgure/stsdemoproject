package com.demo.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.student.service.UserService;

@Controller
public class UsersController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/admin/users", method=RequestMethod.GET)
	public String usersController(Model model) {
		model.addAttribute("user", service.getAll());
		return "admin/users";
	}

}
