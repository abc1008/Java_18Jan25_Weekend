package access_modifier;


public class Class_B
{
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		Class_A aa = new Class_A();
		
		System.out.println(aa.num);
		
		aa.m1();
		
		
		Class_A.m2();
		
		System.out.println(Class_A.num2);
		
	}
	
	

}
