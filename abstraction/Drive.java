package com.abstraction;

public class Drive extends Base {

	public Drive() {
		super(200);  //.........> using super we call parent class parameterize constructor
		System.out.println("Drive Class Contructor");
	}
	
	/* Super :- using super we call parent class constructor if you have call to the constructor 
	 *          only calling inside the constructor of any constructor only declared in first line only
	 *          this super only work in inheritance case becouse it is pointing to the super class only  
	 * */
}
