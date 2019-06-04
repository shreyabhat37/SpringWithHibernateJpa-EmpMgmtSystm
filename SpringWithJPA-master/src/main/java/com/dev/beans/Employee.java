package com.dev.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EmpId")
	private int empID;
	
	@Column(name="EmpFirstName")
	private String empFirstName ;
	@Column(name="EmpLastName")
	private String empLastName ;
	@Column(name="EmpDateOfBirth")
	private String empDateofBirth ;
	@Column(name="EmpDateOfJoining")
	private String empDateofJoining ;
	@Column(name="EmpDeptID")
	private String empDeptID ;
	@Column(name="EmpGrade")
	private String empGrade ;
	@Column(name="EmpDesignation")
	private String empDesignation;
	@Column(name="EmpBasic")
	private int empBasic; 
	@Column(name="EmpGender")
	private String empGender;
	@Column(name="EmpMaritalStatus")
	private String empMaritalStatus ;
	@Column(name="EmpHomeAddress")
	private String empHomeAddress ;
	@Column(name="EmpContactNum")
	private String empContactNum ;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpDateofBirth() {
		return empDateofBirth;
	}
	public void setEmpDateofBirth(String empDateofBirth) {
		this.empDateofBirth = empDateofBirth;
	}
	public String getEmpDateofJoining() {
		return empDateofJoining;
	}
	public void setEmpDateofJoining(String empDateofJoining) {
		this.empDateofJoining = empDateofJoining;
	}
	public String getEmpDeptID() {
		return empDeptID;
	}
	public void setEmpDeptID(String empDeptID) {
		this.empDeptID = empDeptID;
	}
	public String getEmpGrade() {
		return empGrade;
	}
	public void setEmpGrade(String empGrade) {
		this.empGrade = empGrade;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public int getEmpBasic() {
		return empBasic;
	}
	public void setEmpBasic(int empBasic) {
		this.empBasic = empBasic;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmpMaritalStatus() {
		return empMaritalStatus;
	}
	public void setEmpMaritalStatus(String empMaritalStatus) {
		this.empMaritalStatus = empMaritalStatus;
	}
	public String getEmpHomeAddress() {
		return empHomeAddress;
	}
	public void setEmpHomeAddress(String empHomeAddress) {
		this.empHomeAddress = empHomeAddress;
	}
	public String getEmpContactNum() {
		return empContactNum;
	}
	public void setEmpContactNum(String empContactNum) {
		this.empContactNum = empContactNum;
	}
	@Override
	public String toString() {
		return "EmployeeDto [empID=" + empID + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empDateofBirth=" + empDateofBirth + ", empDateofJoining=" + empDateofJoining + ", empDeptID="
				+ empDeptID + ", empGrade=" + empGrade + ", empDesignation=" + empDesignation + ", empBasic="
				+ empBasic + ", empGender=" + empGender + ", empMaritalStatus=" + empMaritalStatus
				+ ", empHomeAddress=" + empHomeAddress + ", empContactNum=" + empContactNum + "]";
	}

}

