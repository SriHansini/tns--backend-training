package com.example.demosriindu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demosriindu.Ioc.DemoIoc;
import com.example.demosriindu.Ioc.Student;


@SpringBootApplication
public class DemosriinduApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(DemosriinduApplication.class, args);
	//DemoIoc ob=con.getBean(DemoIoc.class);
	//ob.display();
Student s=con.getBean(Student.class);
s.print();
	}
}

