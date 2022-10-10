package tostringmethod;

public class DemoMain {
	
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
	 
		demo.setId(10);
		demo.setName("t.shirt");
		demo.setDate("02spt2022");
		
		System.out.println(demo);    // by using to string method object creation
		                             // we are using to string method no need to call getmethod 
		                             // direct used object sop 
		
//		System.out.println(demo.getId());
//		System.out.println(demo.getName());   // without to string method object creation 
//		System.out.println(demo.getDate());
		
	}

}
