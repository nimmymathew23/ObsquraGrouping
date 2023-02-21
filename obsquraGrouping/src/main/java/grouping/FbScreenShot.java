package grouping;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FbScreenShot {
	
	public WebDriver driver;

	@Test
	public void captureScreenshot() throws Exception
	{

		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSession\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("xxx");
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("xxx");
		driver.findElement(By.name("login")).click();
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException, InterruptedException
	{
			
	if(ITestResult.FAILURE==result.getStatus())

		//File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot, new File(".//screenshot//image1.png"));
	//TakesScreenshot ts=(TakesScreenshot)driver;
	
	//File source=ts.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(source, new File(".//Screenshots//"+result.getName()+".png"));
	//FileUtils.copyFile(screenshot, new File(".//screenshot//image1.png"));
	System.out.println("Screenshot taken");
	
	}
	
	//driver.quit();
	}


