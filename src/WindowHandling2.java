import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;;

public class WindowHandling2 {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("suppliment").build()
				.perform();
		a.moveToElement(driver.findElement(By.id("nav-search-submit-button"))).click().build().perform();
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[8]/div[1]/div[1]/span[1]/div[1]/div[1]/div[3]/div[1]/h2[1]/a[1]/span[1]"))
				.click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String ParentId = it.next();
		String ChildId = it.next();

		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.xpath("//span[@id='productTitle']")).getText());
		System.out.println(
				driver.findElement(By.xpath("//span[@id='productTitle']")).getText().split(",")[1].split(" ")[2]
						.trim());
		String Text = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();

		driver.switchTo().window(ParentId);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys(Text).build().perform();
		a.moveToElement(driver.findElement(By.id("nav-search-submit-button"))).click().build().perform();

	}
}
