package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		driver.get("https://demo.automationtesting.in/Datepicker.html");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		Thread.sleep(3000);
		
//		WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		
		String day = "15";
		
		while (true) 
		{
			WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));

			String monthYearText = monthYear.getText();

			if (monthYearText.equals("August 2023")) 
			{
				System.out.println("Found");
				break;
			}

			driver.findElement(By.xpath("//a[@title='Prev']")).click();
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		
		
		

	}

}
