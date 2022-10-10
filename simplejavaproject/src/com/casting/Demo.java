package com.casting;

public class Demo {
	
public static void main(String[] args) {
	
	int i = 99;
	byte a = 10;       // winding casting small datatype stored in large datatype atomatically
	long c = 55;
	
	float j = c;
	float l = a;
	
	double b = i;
	
	System.out.println(i);
	System.out.println(b);
	System.out.println(j);
	System.out.println(l);
}

}
