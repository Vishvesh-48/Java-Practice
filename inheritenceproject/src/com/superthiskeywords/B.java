package com.superthiskeywords;

public class B extends A {
	
    public int j = 200;

    //default constructor of child class first line of default constructor by default is "super".so that moment default constructor or 
   // child class Immediate point to the parent class .
  
   public B() {
    
    	System.out.println("defalt contru of child class --");
   }
//using super key word all the property of parent class access inside the child class 
//(because of superkey word point immediate all property of parent class . )  
    
// and this key word point to the current class all the property of child class access using "this"keyword.    
     
    public void m2() {
    	System.out.println(super.i);
    	System.out.println(this.j);
    	super.m1();
        
    	System.out.println("m2 method of child class--");
    }
    
    public static void main(String[] args) {
		
    	B b = new B();
    	 b.m2();
	}
    
    

}
