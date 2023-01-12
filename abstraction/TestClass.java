package com.abstraction;

public class TestClass {

	public static void main(String[] args) {

		// we can not create abstract class object then that time you
		// only reference has created
		LivingThing live = new Animal(); // ...dynamic dispatch of object
		live.eyes();
		live.mouth();
		live.leag();

		System.out.println("*************");
		LivingThing live2 = new Human();
		live2.eyes();
		live2.mouth();
		live2.leag();
	}
}
