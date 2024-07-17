package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Disableenable {
	
	public static void main(String args []) {
		
		
		  WebDriver driver = new ChromeDriver(); 
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.manage().window().maximize();
			
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); 
			
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
				System.out.println("Enabled");
				Assert.assertTrue(true);
				
			}
			else {
				Assert.assertTrue(false);
			}
			
				
		
	}

}
