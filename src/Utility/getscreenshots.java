package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import BrowserLaunch.BrowserFactoryLaunch;

public class getscreenshots {
	
	public static String getScreenshot(WebDriver driver) throws IOException, InterruptedException
	
	{
		Thread.sleep(2000);

				
	 	TakesScreenshot ts=(TakesScreenshot) BrowserFactoryLaunch.driver;

		File src=ts.getScreenshotAs(OutputType.FILE);

		String path=System.getProperty("user.dir") + "/Screenshots/" + System.currentTimeMillis() + ".png";

		File destination=new File(path);
		FileHandler.copy(src, destination);
		
		return path;

}
	
	
}
