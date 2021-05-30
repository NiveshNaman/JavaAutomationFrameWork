package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
	public static void main(String[] args) throws InterruptedException {
		{System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\BRMS_SystemFunction\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[11]/a")).click();
		Thread.sleep(1000);
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
	
}
