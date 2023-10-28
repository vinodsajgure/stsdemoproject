package com.demo.student.service;

import java.io.IOException;

import javax.mail.MessagingException;

import com.demo.student.dto.Mail;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public interface EmailService {
	
	public void SendEmail(Mail mail) throws MessagingException, TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException;

}
