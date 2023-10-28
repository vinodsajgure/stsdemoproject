package com.demo.student.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.student.dto.UserDto;
import com.demo.student.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String registerController(Model model) {
		model.addAttribute("userDto", new UserDto());
		return "register";
		
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerCon(Model model,@Valid  @ModelAttribute UserDto userdto,BindingResult result) {
		
		if (result.hasErrors()) {
			return "register";
		}
		
	    registerService.registerUser(userdto);
		model.addAttribute("successMsg", "Thank you. Registered Successfully. You can login here");
		model.addAttribute("userDto", new UserDto());
		return "register";
		
	}

}
