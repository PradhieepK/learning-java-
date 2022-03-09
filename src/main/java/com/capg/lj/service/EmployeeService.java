package com.capg.lj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.lj.entities.Employee;
import com.capg.lj.exception.EmployeeNotFoundException;
import com.capg.lj.mapstruct.dto.EmployeeDto;
import com.capg.lj.mapstruct.mapper.IEmployeeMapper;
import com.capg.lj.repository.IEmployeeDao;



@Service("service")
public class EmployeeService implements IEmployeeService{

	
	@Autowired
	private IEmployeeMapper mapper;
	
	@Autowired
	private IEmployeeDao employeeDao;
	
	
	@Override
	public EmployeeDto addEmployee(Employee employee) throws EmployeeNotFoundException{
		if(validateEmployee(employee))
		{
		employeeDao.save(employee);
		}
		
		return mapper.EmployeeToEmployeeDto(employee);
		
	}

	@Override
	public EmployeeDto getEmployee(int employeeId) {
		
		Employee employee = employeeDao.findById(employeeId).orElse(null);
		 
		return mapper.EmployeeToEmployeeDto(employee);
	}
	
	
	public static boolean validateEmployee(Employee employee) throws EmployeeNotFoundException
	{
		boolean flag = false;
		if(employee == null)
			throw new EmployeeNotFoundException("Employee details cannot be blank");
		
		else if(!(validateName(employee.getName()) && validateEmailId(employee.getEmailId())))
			throw new EmployeeNotFoundException("Invalid Data");
		
		else
			flag = true;
		
		return flag;
		
	}
	public static boolean validateName(String name) throws EmployeeNotFoundException
	{
		boolean flag = false;
		if(name == null)
			throw new EmployeeNotFoundException("Name cannot be empty");
		else if(!name.matches("^[a-zA-Z ]+$"))
			throw new EmployeeNotFoundException("Name cannot contain Numbers or Special Characters");
		else
			flag = true;
		return flag;
	}
	
	public static boolean validateEmailId(String emailID) throws EmployeeNotFoundException
	{
		boolean flag = false;
		if(emailID == null)
			throw new EmployeeNotFoundException("emailID cannot be empty");
		else if(!emailID.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))
			throw new EmployeeNotFoundException("EmailId cannot contain Special Characters");
		else
			flag = true;
		return flag;
	}

	
	
	
	
}
