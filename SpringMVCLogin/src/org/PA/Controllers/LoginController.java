package org.PA.Controllers;

//import java.util.Map;

import org.PA.Model.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String viewLogin(Model model) {
		//System.out.println("Controller Calling");
		LoginUser u=new LoginUser();
		model.addAttribute("loginForm", u);
		
		System.out.println("Controller Calling");
		return "loginDetails";
	}

	
}
