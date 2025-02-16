package testpack1;

public class DataTypes {
	
	
	
	public static void main(String[] args) {
		
		
		// SYNTAX
		
//		DataType variableName = value;
		
		
		byte variable1 = 20;     // store value 20 in variable1 of type byte  Range -128 to +127
		short variable2 = 33;	// Range -32768 to +32767
		int variable3 = 40;		// Range -2^31 to +2^31-1
		long variable4 = 50;	// Range -2^18 to +2^18-1
		
		float variable5 = 60.55f;   // Range -2^63 to +2^63-1
		double variable6 = 90.66;   //  Range -2^63 to +2^63-1
		
		
		
//		memory capacity :
		
//		byte -   1 byte  = 8 bit  Binary Num System
//		short - 2 byte	= 16 bit
//		int,float - 4 byte = 32 bit
//		long,double - 8 byte = 34 bit
		
		
//		 Decimal Num System - 0 top 9
		
		
		char variable7 = 'h';    // only 1 character 
		boolean variable8 = true;   // flag 
		boolean variable9 = false;
		
		String variable10 = "  ab***cd  1234@!#999999999999999999999999999   ";  // Unlimited sequence of characters

		
		System.out.println(variable1);
		System.out.println(variable2 + variable3);
		
		
		int multiplication = variable1 * variable3;    // 
		
		
		System.out.println(multiplication);
		
		System.out.println(variable10);
		
		
		
		
	}
	
	

	
	
	
	

}
