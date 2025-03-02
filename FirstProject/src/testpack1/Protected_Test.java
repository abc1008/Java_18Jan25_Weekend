package testpack1;

import access_modifier.Class_A;

public class Protected_Test extends Class_A
{

	public static void main(String[] args) {
		
		Class_A aa = new Class_A();
		
//		System.out.println(aa.num);
//		aa.m1();
		
		Protected_Test pt = new Protected_Test();
		
		System.out.println(pt.num);
		pt.m1();
		
		
		System.out.println(Protected_Test.num2);
		Protected_Test.m2();
		
		System.out.println(Class_A.num2);
		Class_A.m2();
		
	}
	
	
}
