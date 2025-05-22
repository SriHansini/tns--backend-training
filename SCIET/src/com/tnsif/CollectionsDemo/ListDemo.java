package com.tnsif.CollectionsDemo;

import java.util.ArrayList;

public class ListDemo {

public static void main(String args[]) {
		
		int a=10;
		
		
		ArrayList<Integer> ll=new ArrayList<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		for(int i:ll) {
			System.out.println("The elements in List interface" +i);
		}
}
}
