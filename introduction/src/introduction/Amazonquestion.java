package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazonquestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
	   // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] itemNeeded = { "Cucumber", "Beetroot" };

		addItem(driver, itemNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoBtn")));
		
		driver.findElement(By.className("promoBtn")).click();

	}

	public static void addItem(WebDriver driver, String[] itemNeeded) {
		int j = 0;
		List itemNeededList = Arrays.asList(itemNeeded);

		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] names = products.get(i).getText().split("-");

			String formatName = names[0].trim();

			if (itemNeededList.contains(formatName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemNeeded.length) {

					break;
				}
			}

		}

	}

}
