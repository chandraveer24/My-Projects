package com.PA.BootCrud.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.PA.BootCrud.Repo.Team;
import com.PA.BootCrud.Repo.TeamRepo;

@Controller
public class TeamController {
	
	@Autowired
	TeamRepo teamservice;
	
	@RequestMapping(value="/")
	public ModelAndView indexPage()
	{
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("list", teamservice.findAll());
		mv.addObject("team", new Team());
		return mv;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addPage(@ModelAttribute Team t)
	{
		ModelAndView mv=new ModelAndView("redirect:/");
		teamservice.save(t);
		return mv;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deletePage(@PathVariable Integer id)
	{
		ModelAndView mv=new ModelAndView("redirect:/");
		System.out.println(id);
		teamservice.deleteById(id);
		return mv;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editPage(@PathVariable Integer id)
	{
		ModelAndView mv=new ModelAndView("edit");
		//System.out.println(id);
		Optional<Team> team = teamservice.findById(id);
		mv.addObject("team", team);
		return mv;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView editPage(@RequestParam String id, @RequestParam String name, @RequestParam String ranking )
	{
		Team team=new Team();
		team.setId(Integer.parseInt(id));
		team.setName(name);
		team.setRanking(ranking);
		//String id=team.getName();
		//System.out.println(id);
		ModelAndView mv=new ModelAndView("redirect:/");
		teamservice.existsById(Integer.parseInt(id));
		//System.out.println(teamservice.existsById(id));
		if(!teamservice.existsById(Integer.parseInt(id)))
		{
			teamservice.deleteById(Integer.parseInt(id));
			//teamservice.save(team);
		}
		//System.out.println(team.getId());
		teamservice.save(team);
		return mv;
	}
}
