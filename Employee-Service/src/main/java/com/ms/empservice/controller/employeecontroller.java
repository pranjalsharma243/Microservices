package com.ms.empservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.empservice.entity.Employee;
import com.ms.empservice.resttempvo.ResponseTempletVo;
import com.ms.empservice.service.employeeservice;

@RestController
@RequestMapping("/employee")
public class employeecontroller {
	
	@Autowired
	employeeservice empse;
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		
		return empse.saveEmployee(employee);
	}
	@GetMapping("/getemp/{id}")
	public ResponseTempletVo getEmpandDept(@PathVariable("id") int id)
	{
		
		return empse.getEmpandDept(id);
		
		
	}
	
	

}
