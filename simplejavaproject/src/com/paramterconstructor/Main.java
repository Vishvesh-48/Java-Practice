package com.paramterconstructor;

public class Main {
	
	public Main() {
		
		System.out.println("Default Constructor--");
	}
	
	public Main(int i) {
		
		System.out.println("Single parameter Constu--");
		System.out.println(10);
	}
	
	public Main(Student s) {
		
		System.out.println(s.id);
		System.out.println(s.name);
	}
	
	public static void main(String[] args) {
		
		//Main m = new Main();
		//Main m1 = new Main(20);
		
		Student s = new Student();
		s.id =100;
		s.name = "kolte";
		Main m3 = new Main(s);
		
	}

}
