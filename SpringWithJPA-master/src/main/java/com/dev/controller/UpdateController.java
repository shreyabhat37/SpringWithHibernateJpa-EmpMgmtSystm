package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dev.beans.Employee;
import com.dev.service.EmployeeServicesImpl;

@Controller
public class UpdateController {

	@Autowired
	EmployeeServicesImpl empServices;
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public ModelAndView createPage(ModelAndView mv) {
		System.out.println("entered the update");
		mv.setViewName("update");
		return mv;
	}
	
	@RequestMapping(value="/updateEmployee", method=RequestMethod.POST)
	public ModelAndView addEmployee(Employee employee, ModelAndView mv) {
		System.out.println("entered update");
		System.out.println(employee.getEmpID());
		mv.setViewName("msg");
		System.out.println(mv.getViewName());
		String msg = "Failed to add Employee Data";
		boolean state = empServices.updateServ(employee.getEmpID(), employee);
		if(state) {
			msg = "Person Data updated";
		}
		mv.addObject("msg",msg);
		return mv;
	}
	
}
