package testpack1;

public class ConstructorDemo {
	
	int a;

	// Constructor of class: ConstructorDemo
	public ConstructorDemo(int num) 
	{
		System.out.println("int arg - Constructor of class: ConstructorDemo");
		a = num;
	}
	
	public ConstructorDemo(String num) 
	{
		System.out.println("String arg - Constructor of class: ConstructorDemo");
//		a = num;
	}
	
	public ConstructorDemo() 
	{
		System.out.println("0 arg - Constructor of class: ConstructorDemo");
	}
	
	
	public ConstructorDemo(int a, char b) 
	{
		System.out.println("int char arg - Constructor of class: ConstructorDemo");
	}
	
	
	public ConstructorDemo(char a, int b) 
	{
		this(5);   // calling another constructor of 0 arg of current class
		System.out.println("char int - arg Constructor of class: ConstructorDemo");
	
	}
	

	public static void main(String[] args) {
		
		ConstructorDemo c1 = new ConstructorDemo('r', 7);
//		System.out.println(c1.a);
		
		
		
		
//		ConstructorDemo c2 = new ConstructorDemo(200);
//		System.out.println(c2.a);
//		
//		ConstructorDemo c3 = new ConstructorDemo("");
//		System.out.println(c3.a);
		
		
		
		
	}

}
