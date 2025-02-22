package testpack1;

public class ConstructorDemo {
	
	int a;

	// Constructor of class: ConstructorDemo
	public ConstructorDemo(int num) 
	{
		System.out.println("Constructor of class: ConstructorDemo");
		a = num;
	}
	
	public ConstructorDemo(String num) 
	{
		System.out.println("Constructor of class: ConstructorDemo");
//		a = num;
	}
	
	public ConstructorDemo() 
	{
		System.out.println("Constructor of class: ConstructorDemo");
	}
	
	
	public ConstructorDemo(int a, char b) 
	{
		System.out.println("Constructor of class: ConstructorDemo");
	}
	
	
	public ConstructorDemo(char a, int b) 
	{
		System.out.println("Constructor of class: ConstructorDemo");
	}
	

	public static void main(String[] args) {
		
		ConstructorDemo c1 = new ConstructorDemo('r', 7);
		System.out.println(c1.a);
		
		ConstructorDemo c2 = new ConstructorDemo(200);
		System.out.println(c2.a);
		
		ConstructorDemo c3 = new ConstructorDemo("");
		System.out.println(c3.a);
	}

}
