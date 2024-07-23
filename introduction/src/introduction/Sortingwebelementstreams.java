package introduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sortingwebelementstreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		
		
		/*List<String>actualList=elements.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String>listAfterSort=actualList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(actualList.equals(listAfterSort));*/
		
		List<String>priceOfVegiige;
		
		do {
			List<WebElement>elements=driver.findElements(By.xpath("//tbody/tr/td[1]"));
			
			priceOfVegiige=elements.stream().filter(s->s.getText().contains("Potato")).map(s->getVaggies(s)).collect(Collectors.toList());
			
			priceOfVegiige.forEach(a->System.out.println(a));
			
			if(priceOfVegiige.size()<1) {
				
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
				
			}
			
		}while(priceOfVegiige.size()<1);
		
		

	}
	public static String getVaggies(WebElement s) {
		
		String beanValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return beanValue ; 
		
		
	}

}
