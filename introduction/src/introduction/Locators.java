package introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Java Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");// Open your website
		driver.findElement(By.id("inputUsername")).sendKeys("ajay25781"); // id locator 
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//xpath -  //input[@placeholder='Name']
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ajay Sharma");
		
		//cs selector 
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ajay25781@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ajay11607817@gmail.com");
		
		driver .findElement(By.xpath("//form/input[3]")).sendKeys("9459193601");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Ajay");
		
		driver.findElement(By.xpath("//input[contains(@name,'inputPassword')]")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.quit(); 
		
	}

}
