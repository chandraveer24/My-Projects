package com.PA.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showIndexPage()
	{
		return "home";
	}
}
