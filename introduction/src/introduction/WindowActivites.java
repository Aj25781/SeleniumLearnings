package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Java Projects\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.navigate().to("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.navigate().back();
		driver.close();
		
	}

}
