package Flightbooking;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[@class='commonModal__close'])[1]")).click();
		driver.findElement(By.xpath("(//p[@class='code makeRelative'])[1]")).click();
		List <WebElement> listofoptions=driver.findElements(By.xpath("//div[@class='font14 lightGreyText latoBold']"));
		//driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		for(WebElement iterate:listofoptions)
		{
			String a= iterate.getText();
			if(iterate.getText().contains("DEL"))
			{
				//String a= iterate.getText();
				iterate.click();
				break;
			}
		

		}
		
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		List <WebElement> destination=driver.findElements(By.xpath("//div[@class=\"font14 lightGreyText latoBold\"]"));
		for(WebElement iteratedestination:destination)
		{
			if(iteratedestination.getText().contains("HYD"))
			{
				iteratedestination.click();
				break;
			}
			
		}
		String date="4";
		
		String e=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
		
		
		while(true)
		{
			if(e.contains("July 2024"))
			{
			break;
			
		}
			else
			{
				driver.findElement(By.xpath("(//span[@role=\"button\"])[2]")).click();
			}
		

	}
		List<WebElement> b= driver.findElements(By.xpath("//div[@class='dateInnerCell']//p[5]"));
		
		for(WebElement c:b)
		{
		 c.click();
		 break;
		}
	}
          
}