package access_modifier;

public class Class_A 
{
	protected int num = 100;
	protected static int num2 = 200;
	
	protected void m1()
	{
		System.out.println("m1 of class A");
	}
	
	static protected void m2()
	{
		System.out.println("m2 of class A");
	}
	
	public static void main(String[] args) {
		Class_A a1 = new  Class_A();
		
		System.out.println(a1.num);
		
		a1.m1();
		
		
		
	}

}
