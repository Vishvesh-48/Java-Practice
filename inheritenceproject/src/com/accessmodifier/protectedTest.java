package com.accessmodifier;

public class protectedTest {
	
	//data member declared as a protected 
	protected int ui = 20;
	protected String uname = "vishvesh kolte";
	
	// method declared as a protected 
	protected void m1() {
		
		System.out.println("m1 method of protectedTest class --");
		
	}
	
	public static void main(String[] args) {
		
		protectedTest  p = new protectedTest();
		
		System.out.println(p.ui);
		System.out.println(p.uname);
		p.m1();
	}

}