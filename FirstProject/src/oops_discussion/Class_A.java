package oops_discussion;

public class Class_A 
{
	static int num = 100;
	int num2 = 400;
	
	public static void m1()
	{
		System.out.println("m1 method of Class_A");
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		System.out.println(num);
		m1();  
		
		
		Class_A a1 = new Class_A();
		System.out.println(a1.num2);
		
		
		System.out.println(Class_B.var1);

	}
	
	
	
	
	
	
	

}
