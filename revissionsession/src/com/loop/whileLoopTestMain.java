package com.loop;

public class whileLoopTestMain {

	public static void main(String[] args) {
		System.out.println("main method started...");

		display(1);
		display(2);
		display(3);
		display(4);
		
		System.out.println("*********");

		// while started...
		boolean flag = true;

		while (flag) {

			System.out.println("inside while loop ...1");
			flag = false;			
		}
		System.out.println("*********");		
		int i = 1;
		while(i<=100) {// 1<=5-- 2<=5-- 3<=5 4<=5 5<=5  6<=5
			display(i);//1 2 3
			i++; //1++= 1+1= 2++ 2+1=3 4 5 6
		}
		System.out.println("*********");
		boolean flag1= false;
		
		while(flag1) {
			System.out.println("inside while loop..");
		}                            
		do {
			System.out.println("inside do while loop ");
			
		}while(flag1);		
		
		System.out.println("main method completed...");
	}
	
	public static void display(int i) {
		System.out.println("Current number is : I: "+i);
	}			
	
}
