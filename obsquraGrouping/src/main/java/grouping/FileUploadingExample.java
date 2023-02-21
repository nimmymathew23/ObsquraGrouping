package grouping;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadingExample {
	public WebDriver driver;

	@Test
	public void browserLaunch() throws AWTException {
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.findElement(By.className("mqfihd-upload")).click();	
		//using sendkeys()
		//driver.findElement(By.id("file-upload")).sendKeys("D:\\Selenium\\Selenium notes.docx");
	
	WebElement element=	driver.findElement(By.id("file-upload"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",element);//using click action
	Robot rb=new Robot();
	rb.delay(1000);
	StringSelection ss=new StringSelection("D:\\Selenium\\Selenium notes.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

	//paste ctrl+v
	rb.keyPress(KeyEvent.VK_CONTROL);//to press control key
	rb.keyPress(KeyEvent.VK_V);
	//To release the keys
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
