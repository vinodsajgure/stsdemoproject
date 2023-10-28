package com.demo.student.globalExceptionHandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.student.customexceptions.EntityNotFoundException;
import com.demo.student.customexceptions.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(value = EntityNotFoundException.class)
	public String demoContact(Model model, Exception ex) {

		model.addAttribute("error", ex.getMessage());

		return "error";

	}
	
	
	@ExceptionHandler(value=UserNotFoundException.class)
	public String demo(Model model,Exception ex) {
		
		model.addAttribute("error", ex.getMessage());
		return "error";
		
	}
	
	
	@ExceptionHandler(value=Exception.class)
	public String demo1(Model model,Exception ex) {
		
		model.addAttribute("error", ex.getMessage());
		return "error";
		
	}

	
}
