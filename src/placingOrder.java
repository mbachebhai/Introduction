import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class placingOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/country");

		WebElement StaticDropdown = driver.findElement(By.xpath("//option[@value='India']"));
		Select dropdown = new Select(StaticDropdown);
		Thread.sleep(2000);
		dropdown.selectByVisibleText("India");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

	}

}
