package com.condition;

import java.util.Scanner;

public class ScannerTestMain {

	public static void main(String[] args) {
		System.out.println("program Start--");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you name:-");
		
		String name = sc.next();
	    System.out.println("Name-:"+name+"welcome to scanner class-");
	    System.out.println("Enter your persentage:-");
	    int per = sc.nextInt();
	    System.out.println("your % is:-"+per);
	    
		
	}
}
