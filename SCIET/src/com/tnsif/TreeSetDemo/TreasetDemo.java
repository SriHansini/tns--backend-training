package com.tnsif.TreeSetDemo;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class TreasetDemo {
	public static void main(String args[]) {

	LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
	l.add(10);
	l.add(10);
	l.add(34);
	l.add(23);
	for(int i:l) {
		System.out.println(i);
	}
	System.out.println("Exceution using Treeset");
	//TreeSet --> follows natural sorting order
	TreeSet<Integer> ts=new TreeSet<Integer>();
	ts.add(10);
	ts.add(10);
	ts.add(34);
	ts.add(23);
	for(int i:ts) {
		System.out.println(i);
	}	
	
}
}



