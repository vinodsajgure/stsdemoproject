package com.demo.student.dto;

import java.util.Map;

public class Mail {
	
	private String from;
	private String to;
	private String subject;
	private String content;
	private Map<String,Object> templateContent;
	
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Map<String, Object> getTemplateContent() {
		return templateContent;
	}
	public void setTemplateContent(Map<String, Object> templateContent) {
		this.templateContent = templateContent;
	}
	

	
}
