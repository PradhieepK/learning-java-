package com.capg.lj.mapstruct.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class EmployeeDto {
	
	@Id
	@Column(name="ID")
	private int employeeId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="emailId")
	private String emailId;
	
	

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public EmployeeDto(int employeeId, String name, String emailId) {
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
		return "EmployeeDto [employeeId=" + employeeId + ", name=" + name + ", emailId=" + emailId + "]";
	}
	
	
	

	
	
	
	

}
