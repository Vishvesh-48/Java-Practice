package com.condition;

import java.util.Scanner;

public class IfCondition2 {
	
	public static void main(String[] args) {
		
		System.out.println("program start--");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user value--");
		int per = sc.nextInt();
		
		if(per>95) {
			System.out.println("you are in Distinction--");
		}else if(per>85) {
			System.out.println("you are in first class--");
		}else if(per>75) {
			System.out.println("you are in second class--");
		}else if(per>65) {
			System.out.println("you are pass--");
		}else {
             System.out.println("you are fail class--");			
		}
		
	}

}
