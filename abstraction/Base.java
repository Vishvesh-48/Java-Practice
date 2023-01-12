package com.abstraction;

public class Base {

	public Base() {
		System.out.println("Parent Class Constructr");
	}

	public Base(int a) {
		this();// ....................> using this we call the default constructor parent class
		System.out.println(a);
	}

}
