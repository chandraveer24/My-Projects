package com.PA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@Autowired
	public WelcomeService welcomeService;
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "Spring boot Welcomes you";
	}
	
	@RequestMapping("/service")
	public String callingServiceClass()
	{
		return welcomeService.retrieveMessage();
	}
}
