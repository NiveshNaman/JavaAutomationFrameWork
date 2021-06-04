package Pages;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static WebDriver driver ;
	public Login (WebDriver driver) {
		this.driver = driver;
	}
	public static void login() throws InterruptedException {
		    driver.get("https://www.facebook.com/");
		    Thread.sleep(1000);
			driver.findElement(By.xpath(".//a[contains(text(),'English (UK)')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("email")).sendKeys("8858921080");
			Thread.sleep(1000);
			driver.findElement(By.id("pass")).sendKeys("8858921080");
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[contains(text(),'Log In')]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
	}

}
