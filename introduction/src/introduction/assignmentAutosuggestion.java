package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("United");
		Thread.sleep(2000);
		List<WebElement>suggestionUsa=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		int optionSize=suggestionUsa.size();
		String name ="United States (USA)";
		
		for(int i=1;i<optionSize;i++)
		{
			
			if(driver.findElements(By.xpath("//ul[@id='ui-id-1']/li")).get(i).getText().equals(name)) {
				driver.findElements(By.xpath("//ul[@id='ui-id-1']/li")).get(i).click();
				break;
			}
		}
		
	}

}
