package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	String driverPath = System.getProperty("user.dir") + "\\drivers\\geckodriver.exe";
	
	WebDriver driver;
	
	String url = "https://www.google.com";
	
	

	
 	@Test
 	public void demoFun() throws InterruptedException {
	  
 		
 		WebElement box = driver.findElement(By.xpath("//*[@name='q']"));
 		
 		System.out.println("Sending search key");
 		box.sendKeys("Maven Project");
	  
 		
 		Thread.sleep(2000);
 		
 		System.out.println("Closing browser");
 	}
 	
 	
 	@BeforeTest
 	public void launch() {
 		
 		System.setProperty("webdriver.gecko.driver", driverPath);
 		
 		driver = new FirefoxDriver();
 		
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 		
 		driver.get(url);
 		
 		
 	}
 	
 	
 	@AfterTest
 	public void close() {
 		
 		driver.close();
 	}
}
