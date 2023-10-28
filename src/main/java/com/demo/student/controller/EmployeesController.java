package com.demo.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeesController {
	
	@RequestMapping(value="/admin/employees",method=RequestMethod.GET)
	public String empCon() {
		
		return "admin/employees";
	}
	
}
