package com.demo.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.student.customexceptions.UserNotFoundException;
import com.demo.student.dto.StatusDto;
import com.demo.student.service.ContactService;

@Controller
public class EnquiriesController {

	@Autowired
	ContactService contactService;

	@RequestMapping(value = "/admin/enquiries", method = RequestMethod.GET)
	public String enquirycon(Model model) {

		model.addAttribute("enquiries", contactService.getAllEnquiries());
		model.addAttribute("statusDto", new StatusDto());
		return "admin/enquiries";
	}
	
	
	@RequestMapping(value = "/admin/enquiries/{id}", method = RequestMethod.POST)
	public String updateEnquiryStatus(Model model ,@ModelAttribute StatusDto statusDto, @PathVariable("id") int id){

		statusDto.setId(id);
		contactService.updateEnquiryStatus(statusDto);
		return "redirect:";
	}
	
	// delete the inquiry record
	@RequestMapping(value="/admin/enquiries/{id}",method= RequestMethod.DELETE)
	public void deleteEnquiry(@PathVariable("id") int id) {
		contactService.deleteEnquiry(id);
	}
	
	
	
	@RequestMapping(value = "/admin/abc", method = RequestMethod.GET)
	public String abc(Model model) throws Exception{
		
		throw new UserNotFoundException("Enquiry not found.....");
		
	}
	
	

}
