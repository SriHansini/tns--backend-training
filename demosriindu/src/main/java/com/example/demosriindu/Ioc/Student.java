package com.example.demosriindu.Ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
	//private String sname;
	//@Autowired
	private Technology tech;
	//constructor injection
	public Student(Technology tech) {
		super();
	
		this.tech=tech;
		
	}
	public void print() {
		//sname="Honey";
	//	System.out.println("the student details"+sname);
		tech.display();;
		
	}
	

	
		
	

}
