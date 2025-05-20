package com.tnsif.Exception;
	public class Exception {
		public static void main(String[] args) {
	try {
			int a=10;
			int b=0;
			int result=a/b;
			
			System.out.println("The result is"+result);
			
			}
			catch(ArithmeticException e) {
				System.out.println("A number cannot be divided by zero");
			}
		}
	}
	
			
			


	


