package com.example.demosriinducrud.controller;
import java.awt.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demosriinducrud.entity.Employee;
import com.example.demosriinducrud.service.EmployeeService;
@RestController
public class Controller {
	@Autowired
private EmployeeService eser;
	@PostMapping("/addemp")
	public Employee reEmp(Employee emp) {
		return eser.addEmp(emp);
	}
	//Get data
	@GetMapping("/getemp")
	public List<Employee> getEmployee(){
		return eser.getEmp(emp);
	}
	//update
	@PutMapping("/updateemp")
 public Employee updateEmployee(@RequestBody Employee emp) {
 return eser.updateEmp(emp);
	
}
//delete
@DeleteMapping("/deleteemp/(id)")
public Object deleteEmployee(@PathVariable Integer id) {
	return eser.deleteEmp(0);
}
}
