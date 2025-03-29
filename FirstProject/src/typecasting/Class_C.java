package typecasting;

public class Class_C extends Class_B{
	
	
	public void m1()
	{
		System.out.println("m1 of child. ");
	}
	
	
	public void m1(int a)
	{
		System.out.println("m1 of child. ");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
//		Up Casting: Lower to higher (child var into parent type)
		
		Class_C c_ref = new Class_C();
		c_ref.m1();
		
		
		Class_B conv_c_ref = (Class_B)c_ref;
//		Class_B conv_c_ref =  new Class_C();   // parent ref + child obj
		conv_c_ref.m1();
		
		
		
//		Down Casting: higher to lower (parent var into child type)
		
		Class_B b_ref = new Class_B();
		b_ref.m1();
		
		Class_C conv_b_ref = (Class_C)b_ref;
		
//		Class_C conv_b_ref = new Class_B();  // child ref + parent obj
		
//		Class_C conv_b_ref2 = new Class_B();  // not possible because of inheritance. 
		
		
		
		
	}
	
	

}
