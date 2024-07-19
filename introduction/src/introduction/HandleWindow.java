package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		Set<String>windowId=driver.getWindowHandles();
		
		Iterator<String>it=windowId.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		//Please email us at mentor@rahulshettyacademy.com with below template to receive response
		
		String emailString=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailString);
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.name("username")).sendKeys(emailString);
		
		
		 
	}

}
