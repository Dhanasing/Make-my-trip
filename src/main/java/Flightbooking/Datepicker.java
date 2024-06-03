package Flightbooking;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	public void dates()
	{
	WebDriver driver= new ChromeDriver();
	List<WebElement> b= driver.findElements(By.xpath("//div[@class='dateInnerCell']//p[1]"));
	
	for(WebElement c:b)
	{
	System.out.println(c.getText());	
	}
}
}
