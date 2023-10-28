package com.demo.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.student.config.HelloConfig;

@Controller
@PropertySource(value="classpath:hello.properties")
public class HelloController {
	
	@Autowired
	private Environment env;

	
	@RequestMapping(value="/hello", method= RequestMethod.GET)
	@ResponseBody
	public String getData() {
		System.out.println(env.getProperty("db.username"));
		return System.getenv("PROPERTY_FILE");
		
		
	}

}
