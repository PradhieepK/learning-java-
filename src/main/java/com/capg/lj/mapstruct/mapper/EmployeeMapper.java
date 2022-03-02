package com.capg.lj.mapstruct.mapper;

import org.springframework.stereotype.Component;

import com.capg.lj.entities.Employee;
import com.capg.lj.mapstruct.dto.EmployeeDto;

@Component
public class EmployeeMapper implements IEmployeeMapper{
	
	
	public Employee employeeDtoToEmployee(EmployeeDto employeeDto ) {
		
		Employee employee = new Employee();
		employee.setEmployeeId(employeeDto.getEmployeeId());
		employee.setName(employeeDto.getName());
		employee.setEmailId(employeeDto.getEmailId());
		
		return employee;
		
	}
	
		
	@Override
	public EmployeeDto EmployeeToEmployeeDto(Employee employee) {
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setEmployeeId(employee.getEmployeeId());
		employeeDto.setName(employee.getName());
		employeeDto.setEmailId(employee.getEmailId());
		
		return employeeDto;
	}

}
