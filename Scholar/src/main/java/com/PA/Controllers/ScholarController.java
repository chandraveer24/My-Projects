package com.PA.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.PA.Domain.Scholar;
import com.PA.Services.ScholarService;

@Controller
@RequestMapping("/scholar")
class ScholarController {

	@Autowired
	private ScholarService scholarService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addPage()
	{
		ModelAndView mv=new ModelAndView("add");
		mv.addObject("scholar", new Scholar());
		return mv;
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView createScholar(@ModelAttribute Scholar scholar)
	{
		ModelAndView mv=new ModelAndView("home");
		scholarService.addOrUpdateScholar(scholar);
		String message="Successfully added a scholar";
		mv.addObject("message",message);
		return mv;
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView list()
	{
		ModelAndView mv=new ModelAndView("list");
		List<Scholar> list = scholarService.loadAll();
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteScholar(@PathVariable Integer id)
	{
		ModelAndView mv=new ModelAndView("home");
		scholarService.delete(id);
		String message="Successfully Deleted a scholar with id:"+id;
		mv.addObject("message",message);
		return mv;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editPage(@PathVariable Integer id)
	{
		ModelAndView mv=new ModelAndView("edit");
		mv.addObject("scholar", scholarService.loadById(id));
		return mv;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView updateScholar(@ModelAttribute Scholar scholar)
	{
		ModelAndView mv=new ModelAndView("home");
		scholarService.addOrUpdateScholar(scholar);
		String message="Successfully Edited a scholar Id:"+scholar.getId();
		mv.addObject("message",message);
		return mv;
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ModelAndView search()
	{
		ModelAndView mv=new ModelAndView("search");
		mv.addObject("lastName", new Scholar());
		return mv;
	}
	
	@RequestMapping(value="/lnameSearch", method=RequestMethod.POST)
	public ModelAndView searchByLastName(@ModelAttribute Scholar scholar)
	{
		ModelAndView mv=new ModelAndView("searchByLastName");
		String lastName = scholar.getLastName();
		List<Scholar> list = scholarService.loadByLastName(lastName);
		mv.addObject("list", list);
		return mv;
	}
	
}
