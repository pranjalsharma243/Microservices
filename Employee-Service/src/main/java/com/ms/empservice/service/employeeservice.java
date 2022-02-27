package com.ms.empservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.ms.empservice.entity.Employee;
import com.ms.empservice.repository.employeerepository;
import com.ms.empservice.resttempvo.Department;
import com.ms.empservice.resttempvo.ResponseTempletVo;

@Service
public class employeeservice {

	@Autowired	
	employeerepository repo;
	@Autowired
	RestTemplate resttemp;
	public Employee saveEmployee(Employee employee) {
		
		return repo.save(employee) ;
	}

	public ResponseTempletVo getEmpandDept(int id) {
		ResponseTempletVo rt=new ResponseTempletVo();
		Employee emp=repo.findById(id);
		Department dept=resttemp.getForObject("http://localhost:7001/department/getone/"+emp.getDeptid(),Department.class);
		rt.setEmp(emp);
		rt.setDepartment(dept);
		return rt;
		
	}

}
