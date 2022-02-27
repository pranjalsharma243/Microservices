package com.ms.deptservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.deptservice.entity.Department;
import com.ms.deptservice.repository.DepartmentRepository;
@Service	
public class DepartmentService {

	@Autowired
	DepartmentRepository repo;
	public Department saveDepartment(Department department)
	{
		
		return repo.save(department);
	}
	
	public Department findDepartmentById(int deptid)
	{
		
	return 	repo.findById(deptid);
		
	}
	
	
	
	
	
	
	
}
