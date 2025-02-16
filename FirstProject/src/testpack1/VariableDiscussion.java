package testpack1;

public class VariableDiscussion 
{
	
	
//	SYNTAX: 
	
//	static DataType variableName = value;
	
	static int var1 = 10;  // variable declaration +  variable initialization
	
	static int var2;   // variable declaration 
	static byte var3;   
	static short var4;
	static long var5;     // all will get default values
	static float var6;
	static double var7;
	static char var8;
	static boolean var9;
	
//	var2 = 20;    // variable initialization
	
	
	
//	SYNTAX for Non-Static variable :  DataType variableName = value;
	
	int var10 = 50;    // Non-Static variable
	int var21 = 66;    // Non-Static variable
	int var22 = 44;    // Non-Static variable
	int var23 = 22;    // Non-Static variable
	
	public void method1()
	{
		
		int var10 = 800;   // local variable
		
		System.out.println(var10);  // local variable
		
		VariableDiscussion vv =  new VariableDiscussion();
		System.out.println(vv.var10);  // non-static variable
		
		
		System.out.println(this.var10);  // non-static variable
		System.out.println(this.var21);
		
		
//		SYNTAX:  DataType variableName = value;
		
		int var11 = 560;   // local variable
		int var12;
		
		System.out.println(var11);
		
//		System.out.println(var12);
		
		System.out.println(var2);
		
		

		
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		
//		System.out.println(var11);
		
		
//		SYNTAX FOR ACCESSING/CALLING STATIC VARIABLE: 
		
//		staticVariableName;
		
		System.out.println(var1);
		
		VariableDiscussion vv = new VariableDiscussion();
		System.out.println(vv.var1);  // not recommended
		
		
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		
		
		
		System.out.println("************");
		

		
//		System.out.println(vv.var10);  // calling of non-static variable. 
		
		
		vv.method1();
		
		
		
		
		
		
	}
	
	
	
	

}
