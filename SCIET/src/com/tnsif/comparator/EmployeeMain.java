package com.tnsif.comparator;
import java.util.ArrayList;
import java.util.Collections;
public class EmployeeMain {

 public static void main(String args[]) {
			
			
			ArrayList<Employee> l=new ArrayList<Employee>();
			l.add(new Employee(101,"Allen",67893));
			l.add(new Employee(203,"Evan",57893));
			l.add(new Employee(301,"Bobby",20987));
			l.add(new Employee(102,"Candy",47893));
			
			System.out.println("Sort by name");
			Collections.sort(l,new EmployeeNameCom());
			for(Employee e:l) {
				System.out.println(e.eid+","+e.ename+","+e.sal);
			}
			
			System.out.println("Sort by sal");
			Collections.sort(l,new EmployeeSalcom());
			for(Employee e:l) {
				System.out.println(e.eid+","+e.ename+","+e.sal);
			}
		}
	}



