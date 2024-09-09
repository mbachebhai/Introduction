import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddProxy {

	public static void main(String[] args) {
		
		ChromeOptions options= new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");//put the proxy you get from the Network team
		options.setCapability("proxy", proxy);//
				
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
	
	}

}
