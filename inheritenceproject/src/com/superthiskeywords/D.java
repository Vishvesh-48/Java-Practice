package com.superthiskeywords;

public class D extends C {

	public D() {

		this("vishvesh");
		System.out.println("default constructor of D class--");
	}

	public D(String s) {

		super();
		System.out.println("Single parameter constructor--");
	}

	public static void main(String[] args) {

		D d = new D();
	}
}
