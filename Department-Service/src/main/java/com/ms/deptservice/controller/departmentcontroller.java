package com.ms.deptservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ms.deptservice.entity.Department;
import com.ms.deptservice.service.DepartmentService;

@RestController
@RequestMapping(path="/department")
public class departmentcontroller {
	@Autowired
	DepartmentService deptservice;
	@RequestMapping(path="/save",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public Department saveDepartment(@RequestBody Department department)
	{
		return deptservice.saveDepartment(department);
	}
	
	@GetMapping(path="getone/{id}")
	
	public Department findDepartmentByid(@PathVariable("id") int deptid)
	{
		
		return deptservice.findDepartmentById(deptid);
		
	}
	
	
	
	

}
