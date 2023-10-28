package com.demo.student.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailConfig {
	
	@Bean(name="mailSender")
	public JavaMailSenderImpl emailConfig() {
		
		JavaMailSenderImpl mail = new JavaMailSenderImpl();
		mail.setHost("smtp.gmail.com");
		mail.setPort(587);
		mail.setUsername("sajgurefurniture@gmail.com");
		mail.setPassword("cipncgtonenjdvee");
		
		Properties prop = mail.getJavaMailProperties();
		
		prop.put("mail.smtp.starttls.enable","true");
		prop.put("mail.smtp.ssl.protocols","TLSv1.2");
		prop.put("mail.transport.protocol","smtp");
		prop.put("mail.smtp.auth","true");
		prop.put("mail.smtp.ssl.trust","smtp.gmail.com");	
		prop.put("mail.debug","true");
		
		return mail;		
	}
	
	
	@Bean
	public freemarker.template.Configuration getFreeMarkerConfig(){
		
		freemarker.template.Configuration config = new freemarker.template.Configuration(freemarker.template.Configuration.getVersion());
		config.setClassForTemplateLoading(this.getClass(), "/templates/");
		
		return config;
		
	}
	
	
	

}
