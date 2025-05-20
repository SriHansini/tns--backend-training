package com.tnsif.InterfaceDemo;

public class MathOperations {
	public static void main(String[] args) {
		//(parameters)->{statements};
		MathCal add=(a,b)->a+b;
		MathCal mul=(a,b)->a*b;
		
		System.out.println(add.cal(10, 05));
		System.out.println(mul.cal(3,6));
		
	}
}
