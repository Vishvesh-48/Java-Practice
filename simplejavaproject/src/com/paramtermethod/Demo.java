package com.paramtermethod;

public class Demo {
	
  
	public void m1() {
		
		System.out.println("m1 method of Demo class--");
	}

	public void m2(int i) {
		
		System.out.println("single parameter method --");
		System.out.println(i);
	}
	
	public void m3(Student s) {
		
		System.out.println(s.id);
		System.out.println(s.name);
	}
	
	public int addition(int i, int j) {
		
		int c = i+j;
		return c;
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.m1();
		d.m2(10);
		
		Student s = new Student();
		
		s.id=200;
		s.name="vishvesh";
		
		d.m3(s);
		
		int addition = d.addition(20, 30);
		System.out.println(addition);		
		
		
		
		
		
		
		
	}
}
