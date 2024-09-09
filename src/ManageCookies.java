import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageCookies {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//this Will maximize the ChromeWindow
		driver.manage().deleteAllCookies();//This Will delete All the Cookies Before Starting Execution
		driver.manage().deleteCookieNamed("Name of he Cookie");
		//when you delete the session cookie then you have to add it to work on the  specific Website, through below process by adding the session cookie.
		//driver.manage().addCookie("SessionKey");

		//if session key is deleted then you will automatically moved to Login page to Complete the Login process.	
	}
}
