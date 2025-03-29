package typecasting;

public class Class_A {
	
	public static void main(String[] args) {
		
//		Implicit typecasting: lower to higher
		
		byte b = 10;   // --> int 
		System.out.println(b);
		
		int conv_b = (int)b; // changin the data type of b from byte to int
		System.out.println(conv_b);
		
		
		
//		Explicit Typecasting: higher to lower
		
		int x = 130;   // --> byte
		System.out.println(x);
		
		byte conv_x = (byte)x;
		System.out.println(conv_x);
		
	}
	
	

}
