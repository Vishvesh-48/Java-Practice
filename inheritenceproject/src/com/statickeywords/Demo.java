package com.statickeywords;

public class Demo {

	int id;
	String name;
	static String college = "VIT";

	public static void main(String[] args) {
		Demo d = new Demo();

		d.id = 111;
		d.name = "prasad";

		Demo d2 = new Demo();

		d2.id = 111;
		d2.name = "prasad";
		System.out.println("id--" + d.id + "--name--" + d.name + "--college--" + college);
		System.out.println("id--" + d2.id + "--name--" + d2.name + "--college--" + college);
	}

}
