package introduction;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.rahulshettyacademy.com/angularpractice/");
		WebElement nameElement=driver.findElement(By.xpath("//input[@name='name']"));
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String>si=driver.getWindowHandles();
		Iterator<String>pi=si.iterator();
		String parentWindowId=pi.next();
		String childWindowId=pi.next();
		
		driver.switchTo().window(childWindowId);
		driver.get("https://rahulshettyacademy.com/");
		String newText=driver.findElement(By.xpath("//a[contains(text(),'All-Access Membership-Complete Access to 25+ Courses (and counting!)')]"))
.getText();	
		
		driver.switchTo().window(parentWindowId);
		nameElement.sendKeys(newText);
		
		File newFileObject=nameElement.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(newFileObject, new File("ajay.png"));
	}

}
