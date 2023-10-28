package com.demo.student.dao;

import java.util.List;

import com.demo.student.dto.StatusDto;
import com.demo.student.entity.ContactUs;

public interface ContactUsDao {
	
	public void save(ContactUs contactUs);
	public List<ContactUs> findAll();
	public void updateStatus(StatusDto sDto);
	public void saveOrUpdate(ContactUs contactUs);
	public void deleteEnquiry(int id);
}
