package com.capg.lj.mapstruct.mapper;

import org.mapstruct.Mapper;


import com.capg.lj.entities.Employee;
import com.capg.lj.mapstruct.dto.EmployeeDto;

@Mapper(
	    componentModel = "spring"
	)
public interface IEmployeeMapper{
	
	Employee employeeDtoToEmployee(EmployeeDto employeeDto);
	EmployeeDto EmployeeToEmployeeDto(Employee employee);

}
