package com.demo.student.config;
import java.io.IOException;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class Securityhandler extends SavedRequestAwareAuthenticationSuccessHandler  {

	 public void onAuthenticationSuccess(HttpServletRequest request,   HttpServletResponse response, Authentication authentication) throws IOException  {
	        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
	        if (roles.contains("ADMIN")) {
	            response.sendRedirect("admin/dashboard");
	        }
	        else {
	        	response.sendRedirect("/");
	        }
	 }
}
