package com.ms.deptservice.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int deptid;
	private  String deptname;
	private  String deptloc;
	public Department() {
		super();
	}
	public Department(int deptid, String deptname, String deptloc) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.deptloc = deptloc;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptloc() {
		return deptloc;
	}
	public void setDeptloc(String deptloc) {
		this.deptloc = deptloc;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", deptloc=" + deptloc + "]";
	}
	

}
