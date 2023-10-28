package com.demo.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccessDeniedController {
	
	@RequestMapping(value="/access-denied" ,method=RequestMethod.GET)
	public String getAccessDenied(){
		
		return "admin/access-denied";
	}

}
