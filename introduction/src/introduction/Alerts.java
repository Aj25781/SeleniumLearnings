package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver(); 
			
			driver.get("http://www.rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("enter-name")).sendKeys("Ajay");
			driver.findElement(By.id("alertbtn")).click();
			
			System.out.println(driver.switchTo().alert().getText());
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			
			driver.findElement(By.cssSelector(".btn-style")).click();
			
			driver.switchTo().alert().dismiss();
			
			
			
			

	}

}
