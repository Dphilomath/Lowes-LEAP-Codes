package com.daniyal.april9.service;

import org.springframework.stereotype.Service;

import com.daniyal.april9.model.Employee;

@Service
public interface EmployeeService {
	//C
	public Employee saveEmployee(Employee employee);
	//R
	public Employee getEmployeeById(Integer empId);
	//U
	public Employee updateEmployee(Integer empId);
	//D
	public void deleteEmployeeById(Integer empId);
	public Employee updateEmployee(Employee employee);
	
}
