import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("#newWindowBtn")).click();

		Set<String> windows = driver.getWindowHandles();// [ParentId,childId]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Maaz");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Shaikh");
		driver.findElement(By.cssSelector("#englishchbx")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("maazbacchebhai6@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Manpower@007");
		driver.findElement(By.cssSelector("#registerbtn")).click();
		System.out.println(driver.findElement(By.cssSelector("#msg")).getText());
		String Text = driver.findElement(By.cssSelector("#msg")).getText().split(" is ")[1].trim();

		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("#name")).sendKeys(Text);
	}
}
