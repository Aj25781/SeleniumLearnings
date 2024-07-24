package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class LatestFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.rahulshettyacademy.com/angularpractice/");
		WebElement newElement=driver.findElement(By.xpath("//input[@name='name']"));
		
		String getValue=driver.findElement(with(By.tagName("label")).above(newElement)).getText();
		System.out.println(getValue);
		
		WebElement rightButton=driver.findElement(By.id("inlineRadio1"));
		
		String labelMil=driver.findElement(with(By.tagName("label")).toRightOf(rightButton)).getText();
		
		System.out.println(labelMil);
	}

}
