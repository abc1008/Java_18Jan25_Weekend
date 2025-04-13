package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		Thread.sleep(3000);

		List<WebElement> allDays = driver.findElements(By.xpath("//select[@id='day']//option"));

		for (WebElement day : allDays) {
			String dayText = day.getText();
			System.out.println(dayText);

			if (dayText.equals("20")) {
				day.click();
			}
		}

		// 2nd Way to handle dropdown

		Thread.sleep(3000);
		
		
		WebElement allMonths = driver.findElement(By.xpath("//select[@id='month']"));

		Select sel = new Select(allMonths);
		sel.selectByIndex(7);
		
		Thread.sleep(3000);
		sel.selectByValue("11");
		
		
		Thread.sleep(3000);
		sel.selectByVisibleText("Feb");
		
		
		
		
		
		
		

	}

}
