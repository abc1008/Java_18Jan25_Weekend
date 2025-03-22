package encapsulktion;

public class Class_1 
{
	// data hiding
	private double accBalance = 2000.00;
	
	
	public void getBalance()
	{
		System.out.println(accBalance);
	}
	
	
	public void withdraw(double amount)
	{
		
		accBalance  = accBalance - amount;
		
		System.out.println("New Balance : "  + accBalance);
		
	}
	
	
	
}
