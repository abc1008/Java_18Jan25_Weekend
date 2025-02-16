package testpack1;

public class Operators2 {
	
	public static void main(String[] args) {
		

		int a = 10;
		int b = 10;
		
		boolean result = a < b;  // Is a less than b ? 
		System.out.println("result : " + result);
		
		boolean result2 = a > b;  // Is a greater than b ? 
		System.out.println("result2 : " + result2);
		
	    boolean result3 = (a >= b); // is a greater than b OR a is equal to b??
	    System.out.println("result3 : " + result3);
	    
	    boolean result4 = (a <= b);  // is a less than b OR a is equal to b??
	    System.out.println("result4 : " + result4);
	    
	    boolean result5 = (a == b);  //  is a equal to b?
	    System.out.println("result5 : " +result5);
	    
	    boolean result6 = (a != b); // is a not equal to b?
	    System.out.println("result6 : " + result6);
	    
	    
		int p = 60; // assign 60 value to variable p
	    System.out.println(p);
	    
	    
	    int x = 30;
	    int y = 50;
	    
//	    Logical AND
	    boolean combinedResult = (x < y)  &&  (x != 20);
	    System.out.println("combinedResult : "+combinedResult);
	    
	    // Logical OR
	    boolean combinedResult2 = (x > y)  ||  (x != 20);
	    System.out.println("combinedResult2 : "+combinedResult2);
	    
	    
//	    Modulus Operator : return the reainder of division operation
	    
	    int div = 10 % 2; 
	    
	    System.out.println(div);
	    
    	int div2 = 10 % 3;
	    
	    System.out.println(div2);
	    
	    
	    
	    
	    
	    
	}
	
	
	
	
	

}
