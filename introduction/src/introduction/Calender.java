package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();

	}

}
