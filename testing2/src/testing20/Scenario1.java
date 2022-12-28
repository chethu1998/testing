package testing20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario1 
{
	@Test
	private void one()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/cheth/Desktop/dropdown.html");
		 WebElement ele = driver.findElement(By.id("h"));
		 String royal = ele.getText();
		 System.out.println("royal");
		 
	}

}
