package testpack1;

public class Operators {
	
	
	
	
	
	public static void main(String[] args) {
		
		
		int x = 60; 

		
		
		System.out.println();
		System.out.println("*** Pre-Increment ***");
		System.out.println();
		
		System.out.println(x);
		int y = ++x; // first value of x will be increase by 1 and then assigned to y
		System.out.println(y);
		
		
		
		// Post-Increment
		System.out.println();
		System.out.println("*** Post-Increment ***");
		System.out.println();
		
		int a = 40;
		System.out.println(a);
		
		
		int b = a++; // first value of a will be assigned to b and then value of a increase by 1
		System.out.println(b);  // 40 
		System.out.println(a);
		
		
		
		System.out.println();
		System.out.println("*** Pre-Decrement ***");
		System.out.println();
		
		
		int p = 80;
		System.out.println(p);
		
		int q = --p;  // first value of p will be decrease by 1 and then assigned to q
		System.out.println(q);
		
		
		System.out.println();
		System.out.println("*** Post-Decrement ***");
		System.out.println();
		
		int r = 30;
		System.out.println(r);
		
		int s = r--;  // first value of r will be assigned to s and then value of r decrease by 1
		System.out.println(s);
		System.out.println(r);
		
		
	}
	
	
	
	
	

}
