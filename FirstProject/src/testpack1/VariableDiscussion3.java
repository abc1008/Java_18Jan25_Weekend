package testpack1;

public class VariableDiscussion3 
{
	int num = 80;   
	static int num2 = 150;
	
	public static void main(String[] args) 
	{
		VariableDiscussion3 v3 = new VariableDiscussion3();
		System.out.println(v3.num);
		v3.num = 90;   // reinitializing
		System.out.println(v3.num);
		
		VariableDiscussion3 v4 = new VariableDiscussion3();
		System.out.println(v4.num);
		
		VariableDiscussion3 v5 = new VariableDiscussion3();
		System.out.println(v5.num);
		
		System.out.println();
		System.out.println("*** Static Variable ***");
		System.out.println();
		
		System.out.println(v3.num2);
		v3.num2 = 160;  // reinitializing
		System.out.println(v3.num2);
		
		System.out.println(v4.num2);
		System.out.println(v5.num2); 
		
	}
	
	

}
