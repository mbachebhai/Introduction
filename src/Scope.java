import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// 1-To get the count of all link present in a page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2-To get the count of links present in the footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// 3-to get the count of links present in the first column of footer section
		WebElement ColumnDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());

		// 4- Open the all 4 Links present in the column footer section and open them in
		// new tabs and get the title of each Link tab

		// This will Open the All tabs
		for (int i = 1; i < ColumnDriver.findElements(By.tagName("a")).size(); i++) {
			String ClickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLinkTab);
			Thread.sleep(4000);
		}

		// getting the all widows handels
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		// Switching to all Windows an abstracting title
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	}

}
