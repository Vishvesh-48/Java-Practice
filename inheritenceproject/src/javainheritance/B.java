package javainheritance;

import com.accessmodifier.protectedTest;

public class B extends A {   // B class is child class and class A is parent class 
	
	int id = 10;
	
	public void m3() {
		
		System.out.println("m3 method of B class--");
	}
	
	public static void main(String[] args) {
		
		B b = new B();   // object create of child 
		b.m1();
		b.m3();
		System.out.println(b.i);
		System.out.println(b.id);
		
	
		
		
	}
}
