package com.dev.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.dev.beans.Employee;
import com.dev.beans.User;


@Repository
public class HibernateImpl implements EmployeeDAO {
	@PersistenceUnit
	private EntityManagerFactory emf;

	
	public User userLogin(String name,String password) {

		List  allUsers=null;
		User dto=null;
		EntityManager em = null;
		System.out.println("jdbc impl");
		System.out.println(name);
		System.out.println(password);
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			String hql="Select us from User us where us.userName=:name and us.userPassword=:pass";
			Query query=em.createQuery(hql);

			query.setParameter("name",name );
			query.setParameter("pass", password);
			allUsers = query.getResultList();
			
			for (Object object : allUsers) {
				dto=(User)object;
				return dto;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(em != null) {
				em.close();
			}
		}
		return dto;
	}


	
	@Override
	public boolean addPerson(Employee emp) {

		boolean state = false;
		EntityManager em = null;
		
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();
			state = true;
		}catch(Exception e) {
			e.printStackTrace();
			state = false;
		}
		finally {
			if(em != null) {
				em.close();
			}
		}
		return state;
	}

	@Override
	public boolean updatePerson(int empId, Employee employee) {
		EntityManager em = emf.createEntityManager();
		boolean state = false;
		try {
			em.getTransaction().begin();
			Employee e = em.find(Employee.class, empId);
			
			e.setEmpFirstName(employee.getEmpFirstName());
			e.setEmpLastName(employee.getEmpLastName());
			e.setEmpDateofBirth(employee.getEmpDateofBirth());
			e.setEmpDateofJoining(employee.getEmpDateofJoining());
			e.setEmpDeptID(employee.getEmpDeptID());
			e.setEmpGrade(employee.getEmpGrade());
			e.setEmpDesignation(employee.getEmpDesignation());
			e.setEmpBasic(employee.getEmpBasic());
			e.setEmpGender(employee.getEmpGender());
			e.setEmpMaritalStatus(employee.getEmpMaritalStatus());
			e.setEmpHomeAddress(employee.getEmpHomeAddress());
			e.setEmpContactNum(employee.getEmpContactNum());
			
			em.getTransaction().commit();
			state = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return state;
	}

	@Override
	public List<Employee> searchByName(String name) {
		
		EntityManager em = emf.createEntityManager();
		String names[] = null;
		if(name.contains(" ")) {
			names = name.split(" ");
		}else {
			names = new String[2];
			names[0] = name;
			names[1] = name;
		}
		String jpql = "SELECT empo FROM Employee empo WHERE empo.empFirstName=:fname OR empo.empLastName=:lname";
		TypedQuery<Employee> query = em
				.createQuery(jpql,Employee.class);
		query.setParameter("fname", names[0]);
		query.setParameter("lname", names[1]);
		
		List<Employee> list = query.getResultList();
		return list;
	}



	@Override
	public boolean deleteEmployee(int empID) {
		boolean status=false;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Employee empl=em.find(Employee.class, empID);
			if(empl!=null) {
			em.remove(empl);
//			String hql="Delete e from Employee e where e.empID=:eid";
//			Query query=em.createQuery(hql);
//
//			query.setParameter("eid",empID );
			em.getTransaction().commit();
			status=true;}
			else
				return status;
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(em != null) {
				em.close();
			}
		}
		return status;
	}



	@Override
	public List<Employee> listAllEmps() {
		EntityManager em = emf.createEntityManager();
		String names[] = null;
		String jpql = "SELECT empo FROM Employee empo";
		TypedQuery<Employee> query = em
				.createQuery(jpql,Employee.class);
		
		List<Employee> list = query.getResultList();
		return list;

	}



	@Override
	public List<Employee> listAllBySal() {
		EntityManager em = emf.createEntityManager();
		String names[] = null;
		String jpql = "SELECT empo FROM Employee empo Order By empo.empBasic";
		TypedQuery<Employee> query = em.createQuery(jpql,Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}



	@Override
	public List<Employee> listAllByFname() {
		EntityManager em = emf.createEntityManager();
		String names[] = null;
		String jpql = "SELECT empo FROM Employee empo Order By empo.empFirstName";
		TypedQuery<Employee> query = em.createQuery(jpql,Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}



	@Override
	public List<Employee> listAllByLname() {
		EntityManager em = emf.createEntityManager();
		String names[] = null;
		String jpql = "SELECT empo FROM Employee empo Order By empo.empLastName";
		TypedQuery<Employee> query = em.createQuery(jpql,Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}



	
	
	
	
}

