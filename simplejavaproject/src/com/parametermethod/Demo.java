package com.parametermethod;

public class Demo {
	
	public void m1() {
		
		System.out.println("paramer method--");
	}
	
	public void m2(int i) {
		System.out.println("Single parameter method");
	}
	
	public void m3(String s , int j) {
		
		System.out.println("double parameter method--");
	}
	
	public void m4(Student s) {
		
		System.out.println(s.id);
		System.out.println(s.name);
		
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		//d.m1();
		//d.m2(10);
		d.m3("vishvesh", 20);
		
		Student s = new Student();
		
		s.id = 100;
		s.name = "vishvesh--";
	    d.m4(s);
	}

}
