package com.demo.student.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.student.customexceptions.EntityNotFoundException;
import com.demo.student.dto.ContactFormDto;
import com.demo.student.service.ContactService;

@Controller
public class ContactUsController {

	@Autowired
	private ContactService contactService;

	@RequestMapping(value = "/contactus", method = RequestMethod.GET)
	public String getContactusForm(Model model) {
		model.addAttribute("contactFormDto", new ContactFormDto());
		return "contactus";
	}

	@RequestMapping(value = "/contactus", method = RequestMethod.POST)
	public String postContactUs(Model model, @Valid @ModelAttribute ContactFormDto form, BindingResult result) {

		System.out.println(" form data :" + form.getFname());

		if (result.hasErrors()) {
			return "contactus";
		}

		contactService.saveContactUsData(form);
		model.addAttribute("successMsg", "Thank you for contacting us form submitted Successfully...");
		model.addAttribute("contactFormDto", new ContactFormDto());
		model.addAttribute("showForm", "hidden");
		return "contactus";
	}

	@RequestMapping(value = "/contactus/abc", method = RequestMethod.GET)
	public String demoException(Model model) {

		throw new EntityNotFoundException("Entity not found sir ji....");

	}

	
}
