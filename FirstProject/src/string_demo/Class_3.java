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
		 
		 
//		 4. equals(); --  to know if 2 strings are equal or not 
		 
		boolean result4 = s1.equals("Testomete");
		System.out.println(result4);
		 
//		5. equalsIgnoreCase();
		
		boolean result5 = s1.equalsIgnoreCase("testomete");
		System.out.println(result5);
		
		
//		String s1 = "Testometer";
		
		 
//		6. Substring(); -used to create another continuous string from given string. 
		
		System.out.println(s1.substring(4));
		
		System.out.println(s1.substring(4, 8));
		
		
//		7. replace : to replace a char in given string
		
		 String replaced = s1.replace('m', 'Z');
		 
		 System.out.println(replaced);
		 
//		 8. toUpperCase and toLowerCase : to convert each char into upper and lower
//		 case respectively
		 
		 System.out.println( s1.toUpperCase());
		 System.out.println( s1.toLowerCase());
		 
//		 9. trim(); 
		 
		 String s2 = "   Testo    meter        ";
		 
		System.out.println(s2);
		
		 String trimmed = s2.trim();
		
		System.out.println(trimmed);
		
		
		
//		String s1 = "TestomeTer";
		
//		10. indexOf(); - used to get the index of any char in String
		
		 int mindex = s1.indexOf('t');
		System.out.println(mindex);
		
		
//		11. lastIndexOf();   returns last index of given char
		
		int lastIndext = s1.lastIndexOf('t');
		System.out.println(lastIndext);
		
//		12. contains();  
		
		 boolean contains = s1.contains("Meter");
		System.out.println(contains);
		
		
//		13. toCharArray()
		
		 char[] chArr = s1.toCharArray();
		
		 for(char c : chArr)
		 {
			 System.out.println(c);
		 }
		 
		 System.out.println(chArr[6]);
		 
		 
//		 14. split();
		 
			String s5 = "Testo,meter,xyz";
//			String s1 = "Testometer";
		 
		String[] splitArr = s5.split(",");
		 
		 System.out.println(splitArr[0]);
		 System.out.println(splitArr[1]);
		 System.out.println(splitArr[2]);
		 
		 
		 
	}
	
	

}
