package grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {
	public WebDriver driver;
	
	@Test(dataProvider="searchdata")
	public void browserSetup(String searchValue) {
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchValue);
	}
	@DataProvider(name="searchdata")
	public Object[][] searchValue(){
		Object[][] data={{"phone"},{"beautyitems"},{"kitchen"}};
		return data;
}
}
