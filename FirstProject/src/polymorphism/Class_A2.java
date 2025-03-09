package polymorphism;

//			 Child 				Parent 
public class Class_A2 extends Class_A1
{
	
	final int num1 = 200;
	static int num2 = 6000;
	
	
	/*
	 * Overridden method
	 */
	public int m1(int h)
	{
		System.out.println("m1 from child Class_A2");
		
		return 66;
	}
	
	/*
	 * Overloaded Method
	 */
	public int m2(int i, boolean b)
	{
		System.out.println("m2 from child - 2 arg (int, boolean)");
		
		return 5;
	}
	
	public static int m3(int a)   
	{
		System.out.println("m3 of Child - 1 arg int");
		return 5;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("*** Child Object ***");
		System.out.println();
		
		Class_A2 a2 = new Class_A2();    // child class object
		a2.m1(7);    		// Overridden   -- Object is deciding
		a2.m2(4);           // Overloaded   -- Ref Variable is deciding
		
		a2.m2(0, false);
		
		a2.m3(num2);
		
		System.out.println();
		System.out.println("*** Parent Object ***");
		System.out.println();
		
		Class_A1 a1 = new Class_A1();
		a1.m1(6);   // Overridden from parent
		a1.m2(7) ;  // Overloaded from parent 
		
		a1.m3(num2);
		
		
		System.out.println();
		System.out.println("*** Parent Ref + Child Objec ***");
		System.out.println();
		
		Class_A1 pRef = new Class_A2();  // Parent Ref + Child Object
		
		pRef.m1(5);    // Overridden  -- Object is deciding
		pRef.m2(9);    // Overloaded  // Ref variable is deciding
		
		pRef.m3(4);   // static method
		
//		Class_A2 cRef  = new Class_A1();  // Child  Ref + Parent Object  (not possible)
		
		System.out.println();
		
//		a2.num1 = 700;   // re-initialize
		
		
		System.out.println(a2.num1);  	//child class ref
		System.out.println(a1.num1);  	//parent class ref
		
		System.out.println(pRef.num1);  //parent class ref
		
		
		System.out.println(Class_A1.num2);
		System.out.println(Class_A2.num2);
		
		System.out.println(a2.num2);  	//child class ref
		System.out.println(a1.num2);  	//parent class ref
		
		
		
		
		
	}
	



}
