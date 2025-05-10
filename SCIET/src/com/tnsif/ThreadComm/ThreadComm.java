package com.tnsif.ThreadComm;

public class ThreadComm {
	
	int i;
	boolean flag=false;
	
	synchronized void deliver(int data) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.i=data;
		flag=true;
		System.out.println("Data delievered"+i);
		notify();
		
	}
	
	synchronized int receive() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Data received"+i);
		flag=false;
		notify();
		return i;
	}
	
}
