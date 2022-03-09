package com.capg.lj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.lj.entities.Employee;
import com.capg.lj.exception.EmployeeNotFoundException;
import com.capg.lj.mapstruct.dto.EmployeeDto;
import com.capg.lj.service.IEmployeeService;

@CrossOrigin
@RestController
@RequestMapping("/api/lj")
public class EmployeeController {

	@Autowired
	public IEmployeeService service;

	@PostMapping("/addEmployee")
	public ResponseEntity<EmployeeDto> addEmployee(@RequestBody Employee employee) throws EmployeeNotFoundException {

		EmployeeDto employeeDto = service.addEmployee(employee);

		return new ResponseEntity<EmployeeDto>(employeeDto, HttpStatus.ACCEPTED);
	}

	@GetMapping("/getEmployee")
	public ResponseEntity<EmployeeDto> getEmployee(@RequestParam int employeeId) {

		EmployeeDto employeeDto = service.getEmployee(employeeId);

		return new ResponseEntity<EmployeeDto>(employeeDto, HttpStatus.ACCEPTED);

	}

}
