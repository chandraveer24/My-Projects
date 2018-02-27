package com.PA;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class WelcomeService {

	public String retrieveMessage()
	{
		return "I am Coming From Service Class";
	}
}
