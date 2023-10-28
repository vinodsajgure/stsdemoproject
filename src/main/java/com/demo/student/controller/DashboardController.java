package com.demo.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
	
	@RequestMapping(value="/admin/dashboard",method= RequestMethod.GET )
	public String dashboardcon() {
		
		return "admin/dashboard";
	}

}
