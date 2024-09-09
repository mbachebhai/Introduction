import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class FilteredStream {

	public static void main(String[] args) {
		
		//1-Input Rice in filter
		//2-Get the all webElements present in the table into A list 
		//3-make that list into Stream and Filter wrt to text "Rice" Contains and save it inti a List
		//4-Put Assertion equals
		
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement>veggies=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement>filterVegg=veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertTrue(veggies.equals(filterVegg));	
	}
}
