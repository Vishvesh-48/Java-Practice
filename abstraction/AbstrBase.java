package com.abstraction;

public abstract class AbstrBase {

	void display() {  //----> Non-Abstract Method
		System.out.println("desplay method:base class");
	}
	
	abstract void show(); //--->Abstract method 
	
	
	
	/*
	 *        when we declared abstract along with class then class will be abstract
	 * effect :-
	 *        when we declared class as abstract then we can not create object of that class
	 *        
	 *        when we used abstract along with method then method should be abstract 
	 *        Once we declared method as abstract so that time no need no body of that method only declared 
	 *   
	 * effect :- if this abstract class when any class as the inherited that time complsary to write the implementation write
	 *  
	 *        Abstract class may or may not be abstract method if class as abstract that
	 *        time we need to complesary to declared at list one abstract method 
	 *         
	 *         
	 * */
}
