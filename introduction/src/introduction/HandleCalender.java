package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		String month="7";
		String date ="17";
		String year="2025";
		
		String[]array1= {"7","17","2025"};
		
		driver.findElement(By.xpath("//input[@name='year']")).click();
		driver.findElement(By.cssSelector("button[class='react-calendar__navigation__label']")).click();
		driver.findElement(By.cssSelector("button[class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click(); 
		
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		List<WebElement>datePiece=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0 ;i<datePiece.size();i++) {
			
			 System.out.println(datePiece.get(i).getAttribute("value"));
			 Assert.assertEquals(datePiece.get(i).getAttribute("value"),array1[i]);
		}
		
		
	
		
		
		
		
	}

}
