import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertificatte {

	public static void main(String[] args) {
		
		//In this class we will see how to pass the SSL certifications through using ChromeOptions Class method "setAcceptInsecureCerts(true)"
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);		

		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://wrong.host.badssl.com/");

	}

}
