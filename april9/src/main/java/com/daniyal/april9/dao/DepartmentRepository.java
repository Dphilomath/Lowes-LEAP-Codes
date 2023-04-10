package com.daniyal.april9.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.daniyal.april9.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
	//Retrieve data using non primary key
	public Department findByDeptName(String deptName);
	
	public void deleteByDeptName(String deptName);
	
}
