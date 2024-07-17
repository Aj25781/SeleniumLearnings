package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		int length = options.size();
		
		int i; 
		
		for(i=1 ; i<length ; i++)
		{
			WebElement option = options.get(i);
			
			if(option.getText().equalsIgnoreCase("india"))
			{
				driver.findElement(By.className("ui-corner-all")).click();
				break;
			}
			
		}
		

	}

}
