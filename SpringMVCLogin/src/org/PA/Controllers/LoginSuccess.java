package org.PA.Controllers;

import org.PA.Model.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/login1")
public class LoginSuccess {

	@RequestMapping(method=RequestMethod.POST)
	public String processLogin(@ModelAttribute("loginForm") @Validated LoginUser user, BindingResult bindingResult )
	{
		if(bindingResult.hasErrors())
		{
			return "loginDetails";
		}
		System.out.println("UserName:"+ user.getUsername());
		System.out.println("Password:"+user.getPassword());
		return "loginSuccess";
	}
}
