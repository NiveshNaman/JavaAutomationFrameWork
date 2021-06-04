package BrowserLaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class BrowserFactoryLaunch {
	public static WebDriver driver;
	public static void BrowserFactory(String Browser){
		
		if (Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\BRMS_SystemFunction\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		else if (Browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\Workspace\\BRMS_SystemFunction\\driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		else 
		{
			System.out.println ("Invalid Selection");
		}
	}
	

}
