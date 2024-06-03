package Amazonwebsite;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import okio.Timeout;


public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action= new Actions(driver);
		WebElement hover=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		action.moveToElement(hover).build().perform();
		driver.findElement(By.linkText("Your Account")).click();
		
		

	}

}
