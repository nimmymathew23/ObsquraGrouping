package grouping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExample2 {
	public WebDriver driver;

	@Test
	public void logoTest() {
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		//driver.findElement(By.xpath("//img[@src='images/logo.png']"));
}
	@Test
	public void amazonelogoTest() {
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
}
}
