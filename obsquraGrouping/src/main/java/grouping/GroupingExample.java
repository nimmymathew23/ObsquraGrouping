package grouping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupingExample {
	public WebDriver driver;
	@BeforeSuite
	public void browserSetUp() {
	driver=new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	//WebDriverManager.chromedriver().driverVersion("92.0").setup();
	driver.manage().window().maximize();
	}
	@Test(priority=0,groups={"sanity"})
	public void browserLaunch() {
	driver.get("https://selenium.obsqurazone.com/index.php");	
	}
	@Test(priority=1,groups= {"regression"})
	public void titleVerification() {
		System.out.println(driver.getTitle());
	}
	@Test(priority=2,groups= {"smoke"})
	public void print() {
		System.out.println("This is my testcase3");
	}
	

}
