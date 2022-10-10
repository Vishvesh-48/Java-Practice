package com.inheritance;

public class E extends A{
	
	int uid = 100;
	
	public static void main(String[] args) {
		
		E e = new E();
		e.m1();
		System.out.println(e.uid);
	}
}
