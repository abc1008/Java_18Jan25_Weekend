package oops_discussion;

public class Class_C extends Class_B
{
	int num2 = 700;
	
	
	public void m3() 
	{
		System.out.println(super.num2);  // num2 of parent
	}
	
	public static void main(String[] args) 
	{
		m1();  // Class_A method
		Class_C c1 = new Class_C(); // object of Class_C
		System.out.println(c1.num2); // variable of Class_A
		
		c1.m3();  // super variable call
		
		
		
	}
	

}
