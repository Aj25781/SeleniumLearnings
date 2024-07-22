package introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String args[]) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> linkFooter = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		SoftAssert as=new SoftAssert();

		for (WebElement links : linkFooter) {

			String url = links.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			conn.setRequestMethod("HEAD");
			conn.connect();

			int responseCode = conn.getResponseCode();
			System.out.println(responseCode);
			
			as.assertTrue(responseCode<400, "Link "+links.getText()+ " is brokern with status code "+responseCode);
			
			

		}
		as.assertAll();

		

	}

}
