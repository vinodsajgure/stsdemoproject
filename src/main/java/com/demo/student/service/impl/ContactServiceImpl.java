package com.demo.student.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.student.dao.ContactUsDao;
import com.demo.student.dto.ContactFormDto;
import com.demo.student.dto.Mail;
import com.demo.student.dto.StatusDto;
import com.demo.student.entity.ContactUs;
import com.demo.student.service.ContactService;
import com.demo.student.service.EmailService;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactUsDao dao;
	
	@Autowired
	private EmailService emailService;

	@Override
	public void saveContactUsData(ContactFormDto form) {
		ContactUs contactUs = new ContactUs();
		contactUs.setFname(form.getFname());
		contactUs.setLname(form.getLname());
		contactUs.setEmail(form.getEmail());
		contactUs.setMessage(form.getMessage());
		contactUs.setSubject(form.getSubject());
		contactUs.setStatus("NEW");
		
		dao.save(contactUs);
		
		Mail mail = new Mail();
		mail.setFrom(form.getEmail());
		mail.setSubject(form.getSubject());
		mail.setContent(form.getMessage());
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("firstName", form.getFname());
		map.put("lastName", form.getLname());
		map.put("email", form.getEmail());
		map.put("subject", form.getSubject());
		map.put("message", form.getMessage());
		
		mail.setTemplateContent(map);
		
		try {
			emailService.SendEmail(mail);
		} catch (TemplateNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedTemplateNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ContactUs> getAllEnquiries() {
		List<ContactUs> findAll = dao.findAll();
		return findAll;
	}

	@Override
	public void updateEnquiryStatus(StatusDto statusDto) {
		//ContactUs contactUs = new ContactUs();
		//contactUs.setStatus(statusDto.getStatus());
		//contactUs.setId(statusDto.getId());
		//dao.saveOrUpdate(contactUs);
		dao.updateStatus(statusDto);
	}

	@Override
	public void deleteEnquiry(int id) {
		
		
	}
	
	

}
