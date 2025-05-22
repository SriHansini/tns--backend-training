package com.tnsif.Queue;
import java.util.PriorityQueue;
public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> dq=new PriorityQueue<String>();		
		dq.add("Suma");
		dq.add("Harshini");
		dq.add("Varshini");
		
		for(String names:dq) {
			System.out.println(names);
		}

	}
}
