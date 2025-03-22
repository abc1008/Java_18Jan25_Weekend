package interface_demo;

public class Class_A1 implements Interface_1
{

	public void m1() 
	{
		System.out.println("m1 implementation.");
	}

	public void m2() 
	{
		System.out.println("m2 implementation.");
	}
	

	// m3 -  abstract
	

	public void m3() {
		
		System.out.println("m3 implementation.");
		
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println();
		System.out.println("*** implementation class ref + implementation class obj ***");
		System.out.println();
		
		Class_A1 a1 = new Class_A1(); // implementation class object
		a1.m1();
		a1.m2();
		a1.m3();
		

		
		System.out.println();
		System.out.println("*** interface ref + implementation class obj ***");
		System.out.println();
		
		Interface_1 a2 = new Class_A1();
		a2.m1();
		a2.m2();
		a2.m3();
		
		
		Interface_1.m4();  // static method calling
		
		
		
//		Object  // Parent class of all User Defined classest
		
	}
	
	

}
