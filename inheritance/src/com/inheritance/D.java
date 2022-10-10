package com.inheritance;

public class D extends A {
	
	public void m4() {
		System.out.println("m4 method of D class--");
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.m1();
		System.out.println(d.id);
		d.m4();
		
	}

}
