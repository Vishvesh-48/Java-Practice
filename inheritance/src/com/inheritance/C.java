package com.inheritance;

public class C extends B {
	
	public void m3() {
		System.out.println("m3 method of C class--");
	}
	
	public static void main(String[] args) {
		
		C c = new C(); 
		
		c.m1();
		c.m2();
		c.m3();
		System.out.println(c.id);
		
	}

}
