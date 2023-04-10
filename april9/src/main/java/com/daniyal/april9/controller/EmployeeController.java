package com.daniyal.april9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daniyal.april9.*;
import com.daniyal.april9.model.Employee;
import com.daniyal.april9.service.EmployeeService;

@RestController
public class EmployeeController {
		
		@Autowired
		private EmployeeService empService;
	
		//C - Create or Insert
		//http://localhost:8080/saveemployee
		// In request body employee object will send in JSON - Java Script Object Notation
		@PostMapping("/saveemployee")
		public Employee saveEmployee(@RequestBody Employee employee) {
			Employee emp = empService.saveEmployee(employee);
			return emp;
				//return empService.saveEmployee(employee);
		}
		
		
		//R - Retrieve or find 
		//Below url we are passing data as query string so in java method you have to use @RequestParam
		
		//http://localhost:8080/getEmployeeByIdUsingRequestParam?empId=1
		@GetMapping("/getEmployeeByIdUsingRequestParam")
		//public Employee getEmployeeByIdUsingRequestParam(@RequestParam("empId") Integer empId, @RequestParam("name") String empName){
		public Employee getEmployeeByIdUsingRequestParam(@RequestParam("empId") Integer empId) {
			return empService.getEmployeeById(empId);
		}
		
		//Below url we passing data in Path Variable
		//http://localhost:8080/getemployee/1
		@GetMapping("/getemployee/{empId}")
		public Employee getEmployeeById(@PathVariable("empId") Integer empId){
			return empService.getEmployeeById(empId);
		}
		//U - Update a record
		//http://localhost:8080/updateemployee
		@PutMapping("/updateemployee")
		public Employee updateEmployee(@RequestBody Employee employee){
			return empService.updateEmployee(employee);
		}
		//D - Delete a record 
		//http://localhost:8080/deleteemployee/1
		@GetMapping("/deleteemployee/{empId}")
		public void deleteEmployeeById(@PathVariable("empId") Integer empId){
			empService.deleteEmployeeById(empId);
		}
}
