package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AlienController<ModelAlien>
{	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/index")
	public String home(AlienModel alien)
	{
		return "index.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(AlienModel alien)
	{
		repo.save(alien);
		return "index.jsp";
	}
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam Integer aid)
	{
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		AlienModel alien=repo.findById(aid).orElse(new AlienModel());
		mv.addObject(alien);
		return mv;
	}


}
