package com.abstraction;

public class Example2 extends Example1 {

	int a = 10;
	int b = 30;
	
	 void show() {
		
		 System.out.println("Addition Of A and B: "+(a+super.b));
	}
	
	 /* Super :- it is the keyword which is responsible to overcome the 
	  *          variable hiding method hiding between super class and drive class 
	  *          and used to calling the constructor of parent class
	  * */
	
}
