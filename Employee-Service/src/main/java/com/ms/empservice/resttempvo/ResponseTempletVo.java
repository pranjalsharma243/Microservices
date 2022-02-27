package com.ms.empservice.resttempvo;

import com.ms.empservice.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseTempletVo {
	
	private Employee emp;
	private Department department;
	
}
