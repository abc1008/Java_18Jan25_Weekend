package oops_discussion;

			// child 		// parent
public class Class_B extends Class_A
{
	
	static int var1 = 1000;
	int var2 = 2000;
	
	public static void main(String[] args) 
	{
//		System.out.println(Class_A.num);
		
		System.out.println(num); // from parent 
		m1();    // from parent 
		
		
//		Class_A a2 = new Class_A();
//		System.out.println(a2.num2);
		
		
		Class_B b1 = new Class_B();  // object of child class
		System.out.println(b1.num2); // from parent 
		
		System.out.println(var1);
		System.out.println(b1.var2);
		
	}
	
	

}
