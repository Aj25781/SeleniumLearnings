package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver(); 
	
		
		driver.get("http://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Ajay Sharma");
		
		driver.findElement(By.name("email")).sendKeys("ajay25781@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("ajaysharma");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement element=driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select dropdown = new Select(element); 
		
		dropdown.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("17/07/1998");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		driver.quit();
	}

}
