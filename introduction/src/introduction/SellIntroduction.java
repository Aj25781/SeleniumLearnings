package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SellIntroduction {

	public static void main(String[] args) {
		/* This is to invoke google chrome browser browser */
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Java Projects\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
		
		 /*This is to invoke edge browser*/
		  System.setProperty("Webdriver.edge.driver", "C:\\Users\\Administrator\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		  WebDriver driver2 = new EdgeDriver();
		  
         driver1.get("https://www.powerofstocks.com/");
         System.out.println(driver1.getTitle());
         System.out.println(driver1.getCurrentUrl());
        driver1.quit();
	}

}
