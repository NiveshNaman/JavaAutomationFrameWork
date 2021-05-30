package Pages;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\BRMS_SystemFunction\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//System.out.println(driver.getPageSource());
	driver.navigate().to("https://www.facebook.com/");
	driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[11]/a")).click();
	driver.findElement(By.id("email")).sendKeys("8858921080");
	driver.findElement(By.id("pass")).sendKeys("8858921080");
	driver.findElement(By.xpath(".//button[contains(text(),'Log In')]")).click();
	driver.close();	
	}

}
