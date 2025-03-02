package polymorphism;

public class Class_A1 
{
	
	public int m1()
	{
		System.out.println("m1");
		
		return 8;
	}
	
	public int m1(int a)
	{
		System.out.println("1 arg int - m1");
		
		return 5;
	}
	
	private int m2(int a, boolean b)
	{
		System.out.println("1 arg int - m1");
		
		return 5;
	}
	
	public static void m1(char a)
	{
		System.out.println("1 arg char - m1");
	}
	
	void m1(int v, char a)
	{
		System.out.println("1 arg char - m1");
	}
	
	
	public void m1(char a, int v)
	{
		System.out.println("1 arg char - m1");
	}
	


}
