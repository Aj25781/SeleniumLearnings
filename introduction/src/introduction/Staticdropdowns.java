package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Staticdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver(); 
        
         driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
         driver.manage().window().fullscreen();
         WebElement element =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
         Select dropdown = new Select(element); 
         
         dropdown.selectByVisibleText("USD");
         
         System.out.println(dropdown.getFirstSelectedOption().getText());
         
         dropdown.selectByIndex(1);
         
         System.out.println(dropdown.getFirstSelectedOption().getText());
         
         
         
         
         
         
	}

}
