import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(2000);

		// 1-click on table
		// 2-Capture all webElemnts into List
		// 3-capture text of all webElements in a originalList
		// 4-Apply sort on OriginalList-> Get the Sorted List
		// 5-compare both List original and Sorted List

		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> OriginalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = OriginalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(OriginalList.equals(sortedList));
		List<String> price;

		// Task:get the price of Beans and print it?
		// 1-Use filter to get to Beans then build a custom method to get to the price
		// text of Beans
		// 2- save that price as into List and print it out through forEach method.

		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPricetext(s)).collect(Collectors.toList());
			price.forEach(s -> System.out.println(s));

			if (price.size()<1) 
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size()<1);
	}

	private static String getPricetext(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
}
