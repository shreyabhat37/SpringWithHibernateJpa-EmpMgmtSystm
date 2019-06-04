package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public ModelAndView getHome(ModelAndView mv) {
		mv.setViewName("logout");
		return mv;
	}
}
