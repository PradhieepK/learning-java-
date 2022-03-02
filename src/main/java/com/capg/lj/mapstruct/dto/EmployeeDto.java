package com.capg.lj.mapstruct.dto;


public class EmployeeDto {

	private int EmployeeId;
	
	private String name;
	
	private String emailId;

	public EmployeeDto() {
		super();
		
	}
	

	public EmployeeDto(int employeeId, String name, String emailId) {
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
		return "EmployeeDto [EmployeeId=" + EmployeeId + ", name=" + name + ", emailId=" + emailId + "]";
	}
	
	
}
