package com.capg.lj.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="emailId")
	private String emailId;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(int employeeId, String name, String emailId) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.emailId = emailId;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", emailId=" + emailId + "]";
	}
	
	
	

	
	
	
	

}
