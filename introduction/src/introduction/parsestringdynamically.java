package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parsestringdynamically {
	
	public static void main(String args[]) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Java Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String password = getPassword(driver);
		
		
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Ajay");
		
		driver.findElement(By.xpath("//input[contains(@name,'inputPassword')]")).sendKeys(password);
		
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	public  static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");// Open your website
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		String passwordText= driver.findElement(By.className("infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login
		String [] parse1=passwordText.split("'");
		String password1 =parse1[1];
		//  rahulshettyacademy' to Login
		String [] parse2 = password1.split("'");
		String realPassword=parse2[0];
		
		return realPassword ;
		//
		
	}

}
