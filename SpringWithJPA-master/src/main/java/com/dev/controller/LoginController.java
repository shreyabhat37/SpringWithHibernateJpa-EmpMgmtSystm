package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dev.beans.User;
import com.dev.service.EmployeeServicesImpl;

@Controller
public class LoginController {

	@Autowired
	EmployeeServicesImpl services;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public ModelAndView searchPage(ModelAndView mv) {
		mv.setViewName("Login");
		return mv;
	}
	
	@RequestMapping(value="loginUser", method=RequestMethod.GET)
	public ModelAndView searchByName(ModelAndView mv, 
										@RequestParam("uname") String name,
										@RequestParam("pass") String pass) {
		mv.setViewName("msg");
		System.out.println("im from contrioller"+name);
		User u = services.LoginServ(name, pass);
		if(u.getUserType().equalsIgnoreCase("admin")) {
			mv.setViewName("adminHome");
		}
		mv.addObject("msg", u);
		return mv;
	}
}
