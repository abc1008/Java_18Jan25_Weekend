package polymorphism;

public class Class_A1 
{
	
	int num1 = 100;
	static int num2 = 5000;
	
	
	static void m1()
	{
		System.out.println("m1");
	}
	
	public int m1(int a)   // Overridden  
	{
		System.out.println("m1 of Parent - 1 arg int");
		return 5;
	}
	
	public void m2()
	{
		System.out.println("1 arg int - m1");
	}
	
	public void m2(int a)  // Overloaded
	{
		System.out.println("m2 from parent - 1 arg int");
	}
	
	public static int m3(int a)   // Overridden  
	{
		System.out.println("m3 of Parent - 1 arg int");
		return 5;
	}


}
