package com.demo.student.service;

import java.util.List;

import com.demo.student.dto.ContactFormDto;
import com.demo.student.dto.StatusDto;
import com.demo.student.entity.ContactUs;

public interface ContactService {
	
	public void saveContactUsData(ContactFormDto form); 
	
	public List<ContactUs> getAllEnquiries();
	
	public void updateEnquiryStatus(StatusDto statusDto );
	
	public void deleteEnquiry(int id);
}
