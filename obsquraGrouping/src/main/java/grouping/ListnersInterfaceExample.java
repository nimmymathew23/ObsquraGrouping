package grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListnersInterfaceExample {
	
	public WebDriver driver;
	@BeforeTest
	public void browserLaunch() {
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		
	}
	@Test(priority=0)
	public void logoValidate() {
		WebElement element=driver.findElement(By.xpath("//a[@href='index.php']"));
		Assert.assertTrue(element.isDisplayed(),"Logo not displayed");
	}
	@Test(priority=1)
	public void titleValidation() {
		String actual=driver.getTitle();
		String expect="Obsqura";
		Assert.assertEquals(actual, expect, "Title is not correct");
	
	}

}
