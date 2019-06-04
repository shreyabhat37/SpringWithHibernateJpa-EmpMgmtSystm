package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeContorller {
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public ModelAndView getHome(ModelAndView mv) {
		mv.setViewName("adminHome");
		return mv;
	}
}
