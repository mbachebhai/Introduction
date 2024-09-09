import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name = "Maaz";
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // use implicitly wait for Getting All
																			// response properly
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // To visit on page using URL
		driver.findElement(By.id("inputUsername")).sendKeys(name); // Id locator
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy"); // name locator
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText()); // Using a Tag name which is only one in hole
																			// Page
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

	}

}
