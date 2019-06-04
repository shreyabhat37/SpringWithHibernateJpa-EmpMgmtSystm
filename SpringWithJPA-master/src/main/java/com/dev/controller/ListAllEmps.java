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
public class ListAllEmps {

	@Autowired
	EmployeeServicesImpl services;

	
	@RequestMapping(value="listAll", method=RequestMethod.GET)
	public ModelAndView searchByName(ModelAndView mv) 
	{
		mv.setViewName("listAll");
		List<Employee> listE = services.listAllEmps();
		mv.addObject("listEmp", listE);
		return mv;
	}
	
	@RequestMapping(value="listbasic", method=RequestMethod.GET)
	public ModelAndView searchBySal(ModelAndView mv) 
	{
		mv.setViewName("listBasicSal");
		List<Employee> listE = services.listAllBySal();
		mv.addObject("list", listE);
		return mv;
	}
	
	@RequestMapping(value="listfname", method=RequestMethod.GET)
	public ModelAndView searchByFname(ModelAndView mv) 
	{
		mv.setViewName("listFname");
		List<Employee> listE = services.listAllByFname();
		mv.addObject("list", listE);
		return mv;
	}
	
	@RequestMapping(value="listlname", method=RequestMethod.GET)
	public ModelAndView searchByLname(ModelAndView mv) 
	{
		mv.setViewName("listLname");
		List<Employee> listE = services.listAllByLname();
		mv.addObject("list", listE);
		return mv;
	}
	
}
