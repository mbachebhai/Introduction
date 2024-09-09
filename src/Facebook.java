import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("9511885678");
		driver.findElement(By.name("pass")).sendKeys("Maaz");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());

	}

}
