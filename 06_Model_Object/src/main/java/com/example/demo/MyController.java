package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("index")
	public ModelAndView home(Alien alien)
	{
	ModelAndView mv=new ModelAndView();
	mv.addObject("obj",alien);	
	mv.setViewName("index");
	return mv;
		
	}

}
