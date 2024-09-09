import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("draggable")).click();

		Actions a = new Actions(driver);
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source, target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(
				"body.jquery-ui.page-template-default.page.page-id-36.page-slug-droppable.single-author.singular:nth-child(2) div.clearfix.row:nth-child(3) div.content-right.twelve.columns div.widget-area:nth-child(2) aside.widget:nth-child(2) ul:nth-child(2) li:nth-child(10) > a:nth-child(1)"))
				.click();
	}

}
