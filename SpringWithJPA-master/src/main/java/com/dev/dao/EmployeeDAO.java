package com.dev.dao;

import java.util.List;

import com.dev.beans.Employee;
import com.dev.beans.User;

public interface EmployeeDAO {

	public User userLogin(String name,String password);
	public boolean addPerson(Employee emp);
	public boolean deleteEmployee(int id);
	public boolean updatePerson(int id, Employee e);
	public List<Employee> searchByName(String name);
	public List<Employee> listAllEmps();
	public List<Employee> listAllBySal();
	public List<Employee> listAllByFname();
	public List<Employee> listAllByLname();

}
