import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clndr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.findElement(By.id("second_date_picker")).click();
		while (!driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]")).getText().contains("March")) {
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		}
		List<WebElement> date = driver.findElements(By.cssSelector("[class='ui-datepicker-calendar'] td[data-handler='selectDay']"));
		System.out.println(date.size());
		int count = driver.findElements(By.cssSelector("[class='ui-datepicker-calendar'] td[data-handler='selectDay']")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector("[class='ui-datepicker-calendar'] td[data-handler='selectDay']")).get(i).getText();
			if (text.equalsIgnoreCase("15")) {
				driver.findElements(By.cssSelector("[class='ui-datepicker-calendar'] td[data-handler='selectDay']")).get(i).click();
			}
		}
	}
}