package abstract_Discussion;

public abstract class Class_1 
{
	int num1 = 100;
	
	public Class_1(int a)
	{
		System.out.println("Class_1 Constructor");
	}
	
	
	abstract public void m1(); // abstract method or incomplete method
	public abstract void m3();
	public abstract void m5();
	
	
	
	public void m2()   // Concrete or Complete method
	{
		System.out.println("Concrete method m2 from abstract class");
	}
	
	public static void m4()
	{
		System.out.println("static m4");
	}
	
	
	
	
	public static void main(String[] args)
	{
//		Class_1 c1 = new Class_1();
		
		m4();
		

		
	}
}
