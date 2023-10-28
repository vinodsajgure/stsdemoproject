package com.demo.student.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.demo.student.entity.Hello;

@Configuration
@PropertySource(value="classpath:hello.properties")
public class HelloConfig {
	
	@Value("${username}")
	private String username;
	
			


	public void doSomthing() {
		System.out.println(username);
	}
	
	
	@Bean
	public PropertySourcesPlaceholderConfigurer prop() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		return configurer;
	}
}
