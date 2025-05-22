package com.tnsif.SetDemo;
import java.util.HashSet;
public class SetDem {

	public static void main(String args[]) {
	HashSet<Integer> ll=new HashSet<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		for(int i:ll) {
			System.out.println("The elements in Set interface:"+i);
		}
	}
}
