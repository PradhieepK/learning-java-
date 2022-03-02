package com.capg.lj.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="ID")
	private int EmployeeId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="emailId")
	private String emailId;
	

	public Employee() {
		super();

	}
	

	public Employee(int employeeId, String name, String emailId) {
		super();
		EmployeeId = employeeId;
		this.name = name;
		this.emailId = emailId;
	}


	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
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
		return "Employee [EmployeeId=" + EmployeeId + ", name=" + name + ", emailId=" + emailId + "]";
	}
	
	
	

}
