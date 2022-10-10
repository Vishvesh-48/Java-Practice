package com.polyoverriding;

public class Child extends Parent {
	
//-	Need parent child relationship.	
//-	the method parameter is always same.	
//-	must have same return type or covariant return is also work.
//-	access modifiers same or greater than.	
//we can't override private,final,static,method override
	@Override
	public void m1() {

		System.out.println("m1 method override in child class--");
	}

// can not change parameter always same 
	@Override
	public void m2(int i) {
		System.out.println("m2 override in child class--");
	}

//access modifier (change possible greater then parent class 
// Declared but return type cant't be change in override method 
	@Override
	public int m3() {
		return 20;
	}

//covarient return is possible in chid class 
	@Override
	public Parent m5() {
		System.out.println("m5 method overrid in child class-");
		return new Child();
	}

}
