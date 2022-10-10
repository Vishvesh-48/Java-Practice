package com.finalkeyword;

public class A {
	
	final int i = 20;
	
	public final void m1() {
		
		System.out.println("m1 method of com.finalkeyword package class--");
	}
	
	
	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a.i);
	
		a.m1();
		
		
	
	}

}
