package com.ms.empservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity	
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employeetable")
public class Employee {
	@Id
	private int eid;
	private String ename;
	private String esal;
	private int deptid;

}
