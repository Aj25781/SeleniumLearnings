package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,450)");

		List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
		int sizeRows=noOfRows.size();
		System.out.println(sizeRows);
		
		List<WebElement> noOfCoulmn = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th"));
          int sizeCoulmn=noOfCoulmn.size();
          System.out.println(sizeCoulmn);
          
         String expectedText= driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).get(2).getText();
         
         System.out.println(expectedText);
	}

}
