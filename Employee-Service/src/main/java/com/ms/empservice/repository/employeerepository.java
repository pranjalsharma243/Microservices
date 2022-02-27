package com.ms.empservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.empservice.entity.Employee;

public interface employeerepository extends JpaRepository<Employee, Integer> {
public Employee findById(int id);
}
