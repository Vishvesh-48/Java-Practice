package javainheritance;

public class Main {
	
	
	public C m1() {     // extends class as a method return type so first object create and 
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		return c;
	}
	
    public static void main(String[] args) {
		
    	Main m = new Main();
    	
    	C aa = m.m1();              // calling  method of extends class using main class object 
    	                            // create and return type extends class 
    	System.out.println(aa.i);
    	aa.m1();
    	aa.m3();
    	aa.m4();
    	System.out.println(aa.id);
    	System.out.println(aa.uid);
    	
    	
	}
	

}
