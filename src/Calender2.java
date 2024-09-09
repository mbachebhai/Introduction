import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.findElement(By.id("first_date_picker")).click();
		List<WebElement> date= driver.findElements(By.className("data-handler"));
		System.out.println(date.size());

		int counts = driver.findElements(By.className("data-handler")).size();

		for (int i = 0; i < counts; i++) {
			String text = driver.findElements(By.className("data-handler")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("data-handler")).get(i).getText();
			}
		}
	}
}
