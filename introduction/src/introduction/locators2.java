package introduction;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {
	
	public static void main(String arg[]) throws InterruptedException
	
	{
            String name = "Ajay";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Java Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");// Open your website
		driver.findElement(By.id("inputUsername")).sendKeys(name); // id locator 
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
