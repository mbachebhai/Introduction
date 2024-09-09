import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://corporate.spicejet.com/CharterLanding.aspx");

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_ddlCashlessOrigin"));
		Select dropdown = new Select(staticDropdown);
		Thread.sleep(3000);

		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption());
		dropdown.selectByValue("Bagdogra (IXB)");
		System.out.println(dropdown.getFirstSelectedOption());
		dropdown.selectByVisibleText("Bengaluru (BLR)");
		System.out.println(dropdown.getFirstSelectedOption());

		WebElement staticDropdown1 = driver.findElement(By.id("ctl00_mainContent_ddlCashlessDestination"));
		Select dropdown1 = new Select(staticDropdown1);
		Thread.sleep(3000);

		dropdown1.selectByIndex(7);
		System.out.println(dropdown1.getFirstSelectedOption());
		dropdown1.selectByValue("Hyderabad (HYD)");
		System.out.println(dropdown1.getFirstSelectedOption());

	}

}
