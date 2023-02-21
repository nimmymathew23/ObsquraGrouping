package grouping;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListnersClass implements ITestListener {
		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
    }
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }
 public void onTestFailure(ITestResult arg0) {					
	 System.out.println("The name of the testcase failed ");		
    }
 
 public void onTestSkipped(ITestResult Result)					
 {		
 //System.out.println("The name of the testcase Skipped is :"+Result.getName())
}
 
 public void onTestSuccess(ITestResult Result) {
	 System.out.println("The test case success");
 }
}
