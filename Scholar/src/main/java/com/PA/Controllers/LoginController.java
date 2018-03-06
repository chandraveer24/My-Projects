package com.PA.Controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/login",method=RequestMethod.GET )
	public String loadLoginPage(){
		return "login";//this is the name of the jsp
	}
	
	@RequestMapping(value="/accessDenied",method=RequestMethod.GET )
	public String loaAccessDeniedPage(){
		return "accessDenied";//this is the name of the jsp
	}

	@RequestMapping(value="/logout",method=RequestMethod.GET )
	public String logout(HttpServletRequest request, HttpServletResponse response){
		//kill the session
		//load authentication object from spring security context
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){
			//perform a logout
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login";
	}

}
