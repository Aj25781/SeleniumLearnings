package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hclquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
	    driver.findElements(By.tagName("a")).size();
	    
	    WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
	    
	    System.out.println(footerDriver.findElements(By.tagName("a")).size());
	    
	    WebElement sectionDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(sectionDriver.findElements(By.tagName("a")).size());
	    
	    for(int i=1;i<sectionDriver.findElements(By.tagName("a")).size();i++)
	    {
	    	String clickLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	sectionDriver.findElements(By.tagName("a")).get(i).sendKeys(clickLinkTab);
	    	
	    }
	    
	    
	}

}
