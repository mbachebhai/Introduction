import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprgrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // use implicitly wait for Getting All
																			// response properly
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // To visit on page using URL
		driver.findElement(By.id("inputUsername")).sendKeys("Maaz"); // Id locator
		driver.findElement(By.name("inputPassword")).sendKeys("Hello"); // name locator
		driver.findElement(By.className("signInBtn")).click(); // class locator
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // printing the response and
																						// locator as css selector using
																						// ("tagename.attributevalue")

		driver.findElement(By.linkText("Forgot your password?")).click(); // Link text method
		Thread.sleep(1000); // To have Little time wait to get Objects visible
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Maaz");// Xpath locator ("//Tage
																						// name[@attribute='value']")
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Maaz123");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9511885678");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Maaz");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
