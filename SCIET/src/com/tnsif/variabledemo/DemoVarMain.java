package com.tnsif.variabledemo;

public class DemoVarMain {

	public DemoVarMain() {}

		    public static void main(String[] args) {
		        DemoTypeVariables ob = new DemoTypeVariables();
		        ob.numone = 23;
		        ob.number = 34;
		        ob.num = 67;

		        int result = ob.numone - 10;
		        System.out.println("This is instance variable output: " + result);
		        System.out.println("This is static variable output: " + DemoTypeVariables.numthree);
		    }
		}
		
	
		

