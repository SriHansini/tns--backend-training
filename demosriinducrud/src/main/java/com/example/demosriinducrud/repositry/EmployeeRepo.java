package com.example.demosriinducrud.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demosriinducrud.entity.Employee;
@Repository
public interface EmployeeRepo  extends JpaRepository<Employee,Integer>{

}
