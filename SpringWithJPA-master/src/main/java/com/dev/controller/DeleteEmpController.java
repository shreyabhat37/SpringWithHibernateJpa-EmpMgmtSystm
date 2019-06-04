package com.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dev.beans.Employee;
import com.dev.service.EmployeeServicesImpl;

@Controller
public class DeleteEmpController {

	@Autowired
	EmployeeServicesImpl services;
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public ModelAndView searchPage(ModelAndView mv) {
		mv.setViewName("delete");
		return mv;
	}
	
	@RequestMapping(value="deleteEmployee", method=RequestMethod.GET)
	public ModelAndView searchByName(ModelAndView mv, 
										@RequestParam("empID") int empId) {
		mv.setViewName("msg");
		boolean state=false;
		 state =services.deleteServ(empId);
		 String msg = "Failed to add Employee Data";
		if(state) {
			msg="deleted data";
	          System.out.println("deleted data");
			}
			mv.addObject("msg",msg);
		return mv;
	}
}
