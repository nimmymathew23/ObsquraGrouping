package grouping;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerScreenshot implements ITestListener{
	public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
    }
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }
    //private WebDriver driver;
 public void onTestFailure(ITestResult result) {
	
	 System.out.println("The Testcase is failed and check the screenshot of the page ");
	 if (!result.isSuccess()) {
	//File imageFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    }
 }
 
 public void onTestSkipped(ITestResult Result)					
 {		
 //System.out.println("The name of the testcase Skipped is :"+Result.getName())
}
 
 public void onTestSuccess(ITestResult Result) {
	 System.out.println("The test case success");
 }
}
