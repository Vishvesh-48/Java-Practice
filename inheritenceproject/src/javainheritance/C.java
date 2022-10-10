package javainheritance;

public class C extends B {
	
	int uid = 10;
	
	public void m4() {
		
		System.out.println("m4 method of C class--");
		
	}
	
	public static void main(String[] args) {
		
		C c = new C();
		
		c.m1();
		c.m3();
		c.m4();
		System.out.println(c.i);
		System.out.println(c.id);
		System.out.println(c.uid);
	}
}
