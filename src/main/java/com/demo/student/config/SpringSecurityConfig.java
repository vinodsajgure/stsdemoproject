package com.demo.student.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.demo.student.service.UserService;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserService userService;
	
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {

		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(userService);
		daoAuthenticationProvider.setMessageSource(messageSource());
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return daoAuthenticationProvider;

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) {
		auth.authenticationProvider(authenticationProvider());
		
	}
	
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll()
				.antMatchers("/resources/**").permitAll()
				.antMatchers("/aboutus").permitAll()
				.antMatchers("/contactus").permitAll()
				.antMatchers("/gallery").permitAll()
				.antMatchers("/login").permitAll()
				.antMatchers("/register").permitAll()
				.antMatchers("/admin/**").hasAuthority("ADMIN")
				.anyRequest().authenticated()
				.and()
				.formLogin().loginPage("/login").failureUrl("/login?error")
				.loginProcessingUrl("/login").usernameParameter("username").passwordParameter("password").successHandler(successHandler())
				.and()
				.logout().logoutSuccessUrl("/login?logout")
				.and()
				.exceptionHandling().accessDeniedPage("/access-denied")
				.and()
				.csrf().disable();
	}
	
	
	@Bean
	public Securityhandler successHandler() {
		Securityhandler handler = new Securityhandler();
		return handler;
	}
	
	
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
		return bCrypt;
	}
	
	
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("messages", "org/springframework/security/messages"); // my messages will override
																							// spring security messages,
																							// if message code the same
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
}
