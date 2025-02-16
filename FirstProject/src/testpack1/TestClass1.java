package testpack1;

public class TestClass1 
{
	
	public void method3()
	{
		System.out.println("method3 from TestClass1");
		
		MethodDiscussion.method1(); // static method call from another class
		
		MethodDiscussion ref2 = new MethodDiscussion();
		ref2.method2();
	}
	
	
	public void methodTest()
	{
		
	}
	
	
	
	

	public static void main(String[] args) 
	{
		
		// execution always done from top to bottom 
		
		System.out.println("Hello World..!!");  // logic to print the text in console.
		System.out.println("Line 2");
		
		// RAM - Random Access Memory  -- comment
		
		
		TestClass1 ref = new TestClass1();   // Object 
		
//		SYNTAX FOR CALLING METHODS OF ANOTHER CALSS :
		
//		1. STATIC METHOD
		
//		SYNTAX :  ClassName.methodName();
		
		MethodDiscussion.method1(); 
		
		
		System.out.println("************");
		
		ref.method3();
		
		System.out.println("**************");
		
		
//		STATIC VARIABLE OUTSIDE CLASS
		
//		ClassName.staticVariableName;
		
		
		System.out.println(VariableDiscussion.var1);
		
		VariableDiscussion vv = new VariableDiscussion();
		
		System.out.println(vv.var10);  // non-static variable of another class
		
	}

}

