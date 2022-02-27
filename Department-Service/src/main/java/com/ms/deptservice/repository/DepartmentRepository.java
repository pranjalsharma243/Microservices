package com.ms.deptservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.deptservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
	public Department findById(int deptid);
}
