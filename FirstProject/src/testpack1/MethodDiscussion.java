package testpack1;

public class MethodDiscussion {
//	SYNTAX:

//	public static void methodName()
//	{
//		  // method body  - Logic to implement
//	}

	public static void method1() {
		System.out.println("This is static method1 of MethodDiscussion");

		MethodDiscussion ref2 = new MethodDiscussion();
		ref2.method2();

	}

//	public void methodName()
//	{
//		  // method body  - Logic to implement
//	}

	public void method2() {
		System.out.println("This is non-static method2");

//		method1(); // calling of static method

	}

	public static void main(String[] args) {

//		SYNTAX FOR CALLING METHODS

//		1. STATIC METHOD WITHIN SAME CLASS

//		 methodName();  

		method1();

//		2. NON-STATIC METHOD

//		Using object reference variable

		MethodDiscussion ref1 = new MethodDiscussion();
		ref1.method2();

//		ref1.method1();    // not recommended

		System.out.println("Method Calling End.");

	}

}
