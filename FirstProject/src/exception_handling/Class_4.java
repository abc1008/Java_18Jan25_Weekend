package exception_handling;

public class Class_4 {
	
	
	public static void main(String[] args) {
		
		Class_4 c = new Class_4();
		
		// c = reference or class type of data 
		
		int a = 10;
		int b = 20;
		
		
		// User Defined or Customized exceptions. 
		if(a > b)
		{
			throw new NullPointerException();
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("a is less than b");
		}
		
		
		
		
		
		
		
	}
	

}
