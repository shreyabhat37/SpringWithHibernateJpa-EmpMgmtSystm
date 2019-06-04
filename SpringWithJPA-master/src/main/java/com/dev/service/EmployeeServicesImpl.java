package com.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dev.beans.Employee;
import com.dev.beans.User;
import com.dev.dao.EmployeeDAO;
import com.dev.dao.HibernateImpl;

@Repository
public class EmployeeServicesImpl implements EmployeeServices {


	@Autowired
	private  HibernateImpl db;

	@Override
	public boolean createService(Employee employee) {
		boolean state=db.addPerson(employee);
		return state;
	}

	@Override
	public boolean updateServ(int id, Employee e) {
		boolean state=db.updatePerson(e.getEmpID(), e);
		return state;
	}

	@Override
	public boolean deleteServ(int empID) {
		boolean status=db.deleteEmployee(empID);
		return status;
	}

	@Override
	public List<Employee> searchEmp(String name) {

		
			return db.searchByName(name);
		
	}

	@Override
	public User LoginServ(String name, String password) {
		User u=db.userLogin(name, password);
		System.out.println("im fromm service"+name);
		System.out.println(u);
		return u;
	}

	@Override
	public List<Employee> listAllEmps() {
		return db.listAllEmps();
	}

	@Override
	public List<Employee> listAllBySal() {
		return db.listAllBySal();
	}

	@Override
	public List<Employee> listAllByFname() {
		return db.listAllByFname();
	}

	@Override
	public List<Employee> listAllByLname() {

		return db.listAllByLname();
	}

}
