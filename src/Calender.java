import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		Thread.sleep(2000);
		// Above Xpath is Parentxpath and childxpath Traverse relationship method by
		// Adding Two Xpath giving Space in between them

		// Validate the 2nd calendar is enabled or disabled before Clicking roundTrip
		// and after clicking round trip radio button.
		// The"style" attribute is getting changed after Clicking on roundTrip so, we
		// have to take that difference and add validation using assertion
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
	}
}
