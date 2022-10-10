package com.polyoverriding;

public class Parent {
	
	public  void m1(){
		System.out.println("m1 method of parent class--");
	}
	
	public void m2(int i) {
		System.out.println("m2 method of parent class--");
	}
	
	protected int m3() {
		
		return 10;
	}
	
	public static void m4() {
		System.out.println("static method of parent class-");
	}
	
	public Parent m5() {
		
		return new Parent();
	}

}
