package com.demo.student.service.impl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.demo.student.dto.Mail;
import com.demo.student.service.EmailService;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Service
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender emailSender;
	
	@Autowired
	private Configuration freeMarkerConfig;

	@Override
	public void SendEmail(Mail mail) throws MessagingException, TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		MimeMessage Mimemessage = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(Mimemessage,MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,StandardCharsets.UTF_8.name());
		
		Template temp = freeMarkerConfig.getTemplate("contactus.ftl");
		String html = FreeMarkerTemplateUtils.processTemplateIntoString(temp, mail.getTemplateContent());
		
		helper.setTo("Sajgurefurniture@gmail.com");
		helper.setFrom(mail.getFrom());
		helper.setSubject(mail.getSubject());
		helper.setText(html,true);
		
		helper.addInline("image.png", new ClassPathResource("templates/images/043.webp"));
		
		emailSender.send(Mimemessage);
		
		
	}

}
