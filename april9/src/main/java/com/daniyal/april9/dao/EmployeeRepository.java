package com.daniyal.april9.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.daniyal.april9.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	public Employee findByEmpName(String empName);
}