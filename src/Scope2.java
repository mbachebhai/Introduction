import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope2 {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		// 1 Get the total number of Links present in the Page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2 Get the total No of Links present in the footer
		WebElement Linkfooter = driver.findElement(By.className("_1ZMrY_"));
		System.out.println(Linkfooter.findElements(By.tagName("a")).size());

		// 3 Get the total lInks counts present in the Footer column
		WebElement footer = driver.findElement(By.xpath("//footer[1]/div[1]/div[3]/div[1]/div[1]"));
		System.out.println(footer.findElements(By.tagName("a")).size());

		for (int i = 1; i < footer.findElements(By.tagName("a")).size(); i++) {
			String Click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(Click);
		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
}
