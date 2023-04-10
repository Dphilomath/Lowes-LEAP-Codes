package com.daniyal.april9.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniyal.april9.dao.DepartmentRepository;
import com.daniyal.april9.dao.EmployeeRepository;
import com.daniyal.april9.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private DepartmentRepository deptRepo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		//first find whether department exists or not
		//If exists detach department entity 
		//If not then save employee entity directly
		// if(deptRepo.findByDeptName(employee.getDepartment().getDeptName()) != null) {
		// 	return null;
		// }
		return empRepo.save(employee);
	}

	@Override
	public Employee getEmployeeById(Integer empId) {
		Optional<Employee> emp = empRepo.findById(empId);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			return null;
		}
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		if(empRepo.existsById(employee.getEmpId())) {
			return empRepo.save(employee);
		}else {
			return employee;
		}
	}

	@Override
	public void deleteEmployeeById(Integer empId) {
		empRepo.deleteById(empId);
	}


	@Override
	public Employee updateEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
