import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenJunit {
	static WebDriver driver;
	
	
	
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@AfterClass
	public static void afterClass() {
//driver.quit();
	}
@Before
public void before() {
Date date = new Date();
System.out.println("Start Time "+date);
}
@After
public void after() {
	Date date = new Date();
	System.out.println("End Time "+date);
}
@Test
public void userName() throws InterruptedException {
	WebElement txtuserName = driver.findElement(By.id("email"));
	txtuserName.sendKeys("sasi.kmrc@gmail.com");
	Thread.sleep(3000);
}
@Test
public void password() throws InterruptedException {
	WebElement txtpassword = driver.findElement(By.id("pass"));
	txtpassword.sendKeys("SQRsqr403");
	Thread.sleep(3000);
}
@Ignore
public void btnlogin() throws InterruptedException {
	WebElement btnlogin = driver.findElement(By.name("login"));
	btnlogin.click();
	Thread.sleep(3000);
}
}