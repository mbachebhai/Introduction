import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddingExtentions {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\admin\\Desktop\\AdBlock-—-best-ad-blocker.crx"));
							
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");

	}

}
