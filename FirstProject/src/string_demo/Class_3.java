package string_demo;

public class Class_3 {
	
	public static void main(String[] args) {
		
		String s1 = "Testometer";
		
		
//		1. length
		
		 int num = s1.length();
		 System.out.println(num);
		
		
//		 2. concat(); -  to append another string to previous string
		 
		System.out.println(s1.concat(" Institute"));
		
		
//			String s1 = "Testometer";
		
//		 3. charAt();
		
		 char c1 = s1.charAt(5);
		 System.out.println(c1);
		 
		 for(int i = 0; i <= (s1.length() - 1); i++)
		 {
			 System.out.println(s1.charAt(i));
		 }
		 
		 
//		 4. 
		 
		
	}
	
	

}
