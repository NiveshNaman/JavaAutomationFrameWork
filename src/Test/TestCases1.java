package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BrowserLaunch.BrowserFactoryLaunch;
import Pages.Login;
import Pages.SignUp;
import Utility.getscreenshots;

public class TestCases1 {
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
	
	
	@BeforeClass
	public void StartTest()
	{
		report = new ExtentReports(System.getProperty("user.dir")+"\\Reports\\ExtentReportResults.html");
		test = report.startTest("TestExecution");
		
		
	}
	
	@BeforeTest
	public void BrowserLaunch() 
	{
		String Browser = "Chrome";
		BrowserFactoryLaunch.BrowserFactory(Browser);
			
	}
	
	
  @Test (priority = 0)
  public void loginPage() throws InterruptedException, IOException {
	  Login l = new Login(BrowserFactoryLaunch.driver);
	 
	  try {
		  l.login();
		  test.log(LogStatus.PASS, "Login Page Executed Successfully");
		
	} 
	  catch (Exception e) {
		  
		test.log(LogStatus.FAIL, "Login Failed");
		test.log(LogStatus.FAIL,test.addScreenCapture(getscreenshots.getScreenshot(BrowserFactoryLaunch.driver))+ "Test Case 1 Failed: Please Refer Screenshots");
		
			
	}	
	   
  }
    
  @Test (priority = 1)
  public void signup() throws InterruptedException, IOException {
	SignUp s=new SignUp(BrowserFactoryLaunch.driver);
		
	try {
		
		s.signup();
		test.log(LogStatus.PASS, "SignUp Executed successfully");
		
	} 
	   catch (Exception e) {
		
		
		test.log(LogStatus.FAIL, "SignUp FAiled");
		test.log(LogStatus.FAIL,test.addScreenCapture(getscreenshots.getScreenshot(BrowserFactoryLaunch.driver))+ "Test Case 2 Failed: Please Refer Screenshots");
		
	}
	
  }
  
  
  @AfterTest
  public void CloseBrowser()
  {
	  BrowserFactoryLaunch.driver.quit();
	  
  }
  
  @AfterClass
  public void endtest()
  
  {
	  report.endTest(test);
	  report.flush();
  }
  
}
