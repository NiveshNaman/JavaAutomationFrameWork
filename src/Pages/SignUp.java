package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
	public static WebDriver driver;
	public SignUp (WebDriver driver){
		this.driver =driver;
	}
	public static void signup() throws InterruptedException {
		driver.findElement(By.xpath(".//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("qwerty");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("qas");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("8858921080");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("885892108000");
		Select dropdown = new Select(driver.findElement(By.id("day")));
		dropdown.selectByValue("30");
		Thread.sleep(1000);
		Select dropdown1 = new Select(driver.findElement(By.id("month")));
		dropdown1.selectByValue("2");
		Thread.sleep(1000);
		Select dropdown2 = new Select(driver.findElement(By.id("year")));
		dropdown2.selectByValue("2001");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	}
}
	

