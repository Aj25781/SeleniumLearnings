package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("//a[@id='nav-link-accountList']"))).build().perform();
		
	}

}
