package testpack1;

public class Car 
{
	int num = 900;
	
	Car()
	{
		
	}

	public static void displaySkodaCarProperties()
	{
//		Car c = new Car();
		



		System.out.println("Code from GitHub");

		
		String color = "Red";
		String brand = "Skoda";
		int speed = 800;
		
		System.out.println("Color of car is : " + color);
		System.out.println("Brand of car is : " + brand);
		System.out.println("Speed of car is : " + speed);
	}
	
	public static void displayBMWCarProperties()
	{
//		Car c = new Car();
		
		String color = "Black";
		String brand = "BMW";
		int speed = 2000;
		
		System.out.println("Color of car is : " + color);
		System.out.println("Brand of car is : " + brand);
		System.out.println("Speed of car is : " + speed);
	}
	
	
	public static void main(String[] args) 
	{
		
		displaySkodaCarProperties();
		
		System.out.println();  // new line
		
		
		displayBMWCarProperties();
		
		
		Car c1 = new Car();
		
		
	}
	

}
