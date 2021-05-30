package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases1 {
	public WebDriver driver;
	
	@BeforeTest
	public void BrowserLaunch() 
	{
		    System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\BRMS_SystemFunction\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
	}
	
	
  @Test (priority = 0)
  public void loginPage() throws InterruptedException {
	  
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
  
  
  @Test (priority = 1)
  public void signup() throws InterruptedException {
	  
	    //driver.navigate().to("https://www.facebook.com/");
		//driver.findElement(By.xpath(".//a[contains(text(),'English (UK)')]")).click();
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
  
  
  @AfterTest
  public void CloseBrowser()
  {
	  driver.close();
	  
  }
}
