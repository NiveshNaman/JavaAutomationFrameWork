package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowserLaunch.BrowserFactoryLaunch;
import Pages.Login;
import Pages.SignUp;

public class TestCases1 {
	public WebDriver driver;
	
	@BeforeTest
	public void BrowserLaunch() 
	{
		String Browser = "Chrome";
		BrowserFactoryLaunch.BrowserFactory(Browser);
			
	}
	
	
  @Test (priority = 0)
  public void loginPage() throws InterruptedException {
	  Login l = new Login(BrowserFactoryLaunch.driver);
	  l.login();
	  
	
	   
  }
  
  
  @Test (priority = 1)
  public void signup() throws InterruptedException {
	SignUp s=new SignUp(BrowserFactoryLaunch.driver);
	s.signup();
		
  }
  
  
  @AfterTest
  public void CloseBrowser()
  {
	  BrowserFactoryLaunch.driver.quit();
	  
  }
}
