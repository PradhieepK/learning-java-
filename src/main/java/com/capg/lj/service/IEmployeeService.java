package com.capg.lj.service;


import com.capg.lj.entities.Employee;
import com.capg.lj.exception.EmployeeNotFoundException;
import com.capg.lj.mapstruct.dto.EmployeeDto;

public interface IEmployeeService {
	
	public EmployeeDto addEmployee(Employee employee) throws EmployeeNotFoundException;
	
	public EmployeeDto getEmployee(int employeeId);

}
