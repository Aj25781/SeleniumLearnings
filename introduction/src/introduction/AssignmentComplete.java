package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	    
	    driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	    
	    driver.findElement(By.id("password")).sendKeys("learning");
	    
	    driver.findElement(By.className("checkmark")).click();
	    
	   Select options = new Select(driver.findElement(By.xpath("//select[@data-style='btn-info']")));
	   
	   options.selectByIndex(0);
	   
	   driver.findElement(By.xpath("//input[@name='terms']")).click();
	   
	   WebDriverWait w = new WebDriverWait(driver , Duration.ofSeconds(5));
	   w.until(ExpectedConditions.elementToBeClickable(By.id("signInBtn")));
	   
	   driver.findElement(By.id("signInBtn")).click();

	}

}
