import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		{
			driver.get("https://www.amazon.in/");
			Actions a = new Actions(driver);
			WebElement Element = driver.findElement(By.id("nav-link-amazonprime"));
			a.moveToElement(Element).build().perform();
			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).doubleClick().keyDown(Keys.BACK_SPACE).build().perform();

		}
	}
}
