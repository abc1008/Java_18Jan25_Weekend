package testpack1;

public class VariableDiscussion2 {
	
	int num1 = 8000;      // non-static variable
	static int num3 = 80; // static variable
	static boolean result = false;   
	
	public void display()
	{
		System.out.println("**** display method ****" );
		
		
		int num2 = 70;   // local Variable
		System.out.println("local variable num2 : "+num2);
	}
	
	public static void main(String[] args) 
	{
		VariableDiscussion2 vv2 = new VariableDiscussion2();
		vv2.display();
		
		System.out.println("Non-Static variable num1 : " + vv2.num1);
		System.out.println("Static variable num3 : "+num3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		String s1 = " Aditya           ";
		
		
		// String concatenation Operators
		
		System.out.println("This is main method : "+ result + " from VariableDiscussion2 class.");
	
		
//		System.out.println(this.num);   error 
		
		

	}

}
