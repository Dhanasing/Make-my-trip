package LunchingBrowser;



import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Firstprogram {


	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
     ChromeDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     driver.findElement(By.xpath("//input[@value='radio2']")).click();
     driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("This is my first webpage automation");
     WebElement abb=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));//Dropdown
     Select dropdown= new Select(abb);//Dropdown
     dropdown.selectByIndex(2);//Dropdown
     driver.findElement(By.xpath("//a[@id='opentab']")).click();    
     Set<String> windowhandles =driver.getWindowHandles();
     Iterator<String> iterate=windowhandles.iterator();
     String parentwindow = iterate.next();
     String childwindow = iterate.next();
     driver.switchTo().window(childwindow);
     driver.findElement(By.linkText("Access all our Courses")).click();
     driver.close();
     driver.switchTo().window(parentwindow);
     driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
     Alert a= driver.switchTo().alert();
     a.accept();
     driver.findElement(By.xpath("//input[@id='name']")).sendKeys("This is Dhanasingh");
     driver.findElement(By.id("confirmbtn")).click();
     String b=driver.switchTo().alert().getText();
     System.out.println(b);
     driver.switchTo().alert().accept();
     Thread.sleep(2000);
     WebElement a1 =  driver.findElement(By.xpath("//button[@id='mousehover']"));
     Actions hover= new Actions(driver);    
     hover.moveToElement(a1).perform();
     driver.switchTo().frame(0);
     driver.findElement(By.xpath("//div[@id='sub-frame-error']")).click();
     
	}
}
     
