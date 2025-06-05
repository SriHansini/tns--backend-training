package com.example.demosriinducrud.service;
import java.awt.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demosriinducrud.entity.Employee;
import com.example.demosriinducrud.repositry.EmployeeRepo;

//CRUD
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo erepo;
	public Employee addEmp(Employee emp) {
		return erepo.save(emp);
	}
	//Get data
	public List<Employee> getEmp(Employee emp){
		return erepo.findAll();
	}
	//update data
	public Employee updateEmp(Employee emp) {
		Integer eid=emp.getEid();
		Employee emp1=erepo.findById(eid).get();
		emp1.setEname(emp.getEname());
		emp1.setEdept(emp.getEdept());
		return erepo.save(emp1);
	}
	//delete
	public void deleteEmp(int id) {
		return erepo.deleteById(id);
	}
	
}
