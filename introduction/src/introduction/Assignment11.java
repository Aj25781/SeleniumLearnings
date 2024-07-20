package introduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click(); 
		
		System.out.println(driver.findElement(By.xpath("//label[@for='benz']")).getText());
		String optionName=driver.findElement(By.xpath("//label[@for='benz']")).getText();
		WebElement dropdown12 = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown12);
		s.selectByVisibleText(optionName);
		
		
		
		
		
	}

}
