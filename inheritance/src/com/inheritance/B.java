package com.inheritance;

public class B extends A {

	public void m2() {
		
		System.out.println("m2 method of child class--");
	}
	
	public static void main(String[] args) {
		
		A a = new A(); // parent class 
		a.m1();
		System.out.println(a.id);
		
		B b = new B();
		b.m1();
		b.m2();
		System.out.println(b.id);
	    
		
	}
	
}
