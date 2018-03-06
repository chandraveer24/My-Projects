package com.PA.Controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.PA.Domain.Scholar;
import com.PA.Services.ScholarService;

@Controller
@RequestMapping("/scholar/json")
public class JacksonController {
	
	@Autowired
	ScholarService scholarService;
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ModelAndView search()
	{
		ModelAndView mv=new ModelAndView("search");
		mv.addObject("lastName", new Scholar());
		return mv;
	}
//scholar/json/lnameSearch
	@RequestMapping(value="/lnameSearch", method=RequestMethod.POST)
	public @ResponseBody String getShopInJSON(@ModelAttribute Scholar scholar) {

		List<Scholar> scholars=new ArrayList<>();
		String lastName = scholar.getLastName();
		scholars = scholarService.loadByLastName(lastName);
		StringBuilder string = new StringBuilder();
		
		for (Scholar scholar2 : scholars) {
			ObjectMapper mapperObj = new ObjectMapper();
	        try {
	            String jsonStr = mapperObj.writeValueAsString(scholar2);
	            string.append(jsonStr);
	            //string.append(System.lineSeparator());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
		
		
		return string.toString();

	}

}
