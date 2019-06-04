package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dev.beans.Employee;
import com.dev.service.EmployeeServicesImpl;

@Controller
public class CreateEmpController {

	@Autowired
	EmployeeServicesImpl empServices;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView createPage(ModelAndView mv) {
		System.out.println("entered the create");
		mv.setViewName("create1");
		return mv;
	}
	
	@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
	public ModelAndView addEmployee(Employee employee, ModelAndView mv) {
		
		mv.setViewName("msg");
		System.out.println(mv.getViewName());
		String msg = "Failed to add Employee Data";
		boolean state = empServices.createService(employee);
		if(state) {
		msg = "Entered Employee Data";
		}
		mv.addObject("msg",msg);
		return mv;
	}
}
