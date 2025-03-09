package abstract_Discussion;

public class Class_3 extends Class_2
{
	public Class_3()
	{
		System.out.println("Class_3 Constructor");
	}
	
	public void m5() 
	{
		System.out.println("m5 implementation");
	}
	
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("*** Child ref + Child obj ***");
		System.out.println();
		
		Class_2 c2 = new Class_3();
		c2.m1();
		c2.m3();
		
		System.out.println();
		System.out.println("*** abstract ref + Child obj ***");
		System.out.println();
		
		Class_1 c3 = new Class_3(); 
		c3.m1();
		c3.m3();
		
		
		System.out.println(c3.num1);
		
	}

}
