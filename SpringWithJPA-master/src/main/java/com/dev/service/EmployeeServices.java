package com.dev.service;

import java.util.List;

import com.dev.beans.Employee;
import com.dev.beans.User;

public interface EmployeeServices {
	
	public User LoginServ(String name,String password);
	public boolean createService(Employee e);
	public boolean updateServ(int id, Employee e);
	public boolean deleteServ(int id);
	public List<Employee> searchEmp(String name);
	public List<Employee> listAllEmps();
	public List<Employee> listAllBySal();
	public List<Employee> listAllByFname();
	public List<Employee> listAllByLname();

	
}
