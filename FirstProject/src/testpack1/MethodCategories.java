package testpack1;

public class MethodCategories {

	
	
		// return type
//	void = nothing
	public void addition( int num1, int num2 )
	{
//		int a = 300;
//		int b = 200;
		
		int ans = num1 + num2;   // logic
		
		
		System.out.println(ans);
	}
	
	
	public void printAccount(String s1)
	{
		System.out.println(s1);
		
		
	}
	
	
	public int multiplication(int num1, int num2)
	{
		int ans = num1 * num2;
		
		return ans;
	}
	
	
	public void m1()
	{
		
		int ans = multiplication(8, 8);
		
		System.out.println(ans + 100);
		
		
		
	}
	
	public String m12()
	{
		
		return "yui";
	}
	
	
	
	
	public String getAccuntName(int accId)
	{
		
		String accName = "Initialized Value";
		
		if(accId == 1)
		{
			accName = "ABC";
		}
		else if(accId == 2)
		{
			
			accName = "PQR";
			
		}
		else if(accId == 3)
		{
			accName = "QWE";
		}
		else
		{
			accName = "Incorrect Id";
		}
		
		return accName;
	}
	
	public static void main(String[] args) {
		
		MethodCategories m = new MethodCategories();
		m.addition(600,700);
		m.addition(800,900);
		m.printAccount("Acc Name");
		
		
		
		
		int result = m.multiplication(2, 5);
		
		System.out.println(result);
		
		
		
		String accName = m.getAccuntName(30);
		System.out.println(accName);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
