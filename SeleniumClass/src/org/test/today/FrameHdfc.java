package org.test.today;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHdfc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.8109554.1749402571.1625893522-1262688318.1594477130");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("login_page");
	    WebElement login = driver.findElement(By.name("fldLoginUserId"));
	    login.sendKeys("12231324");
	    
	    Thread.sleep(3000);
	    WebElement login1 = driver.findElement(By.xpath("//img[@alt='continue']"));
	    login1.click();
	    Thread.sleep(3000);
	    WebElement login2 = driver.findElement(By.name("fldPassword"));
	    login2.sendKeys("RDtrs");
	    
	    Thread.sleep(3000);
	    WebElement login3 = driver.findElement(By.xpath("//img[@alt='Login']"));
	    login3.click();
		
		
	}

}
