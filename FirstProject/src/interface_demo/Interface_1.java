package interface_demo;

public interface Interface_1 
{
	// public static final 
	int num = 10;
	
	void m1(); // by default public and abstract
	void m2();
	void m3();
	
	public static void m4()
	{
		System.out.println("static m4 from interface");
	}
	
	
	public static void main(String[] args) 
	{
		m4();  // static method in same interface
		
				
		System.out.println(num);
	}

}
