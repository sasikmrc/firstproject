package org.windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class WindowsHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\eclipse-workspace\\WindowsHandling\\chrome driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
Timeouts out = op.timeouts();
out.implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("www.amazon.in/");
	driver.manage().window().maximize();
	
	
	WebElement txtSearch= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	txtSearch.sendKeys("iwatch Series 6");
	txtSearch.click();
	Thread.sleep(4000);
	
	WebElement searchClick= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	searchClick.click();
	
	WebElement iWatch= driver.findElement(By.xpath("(//span[contains(text(),'New Apple Watch Series 6 (GPS + Cellular, 44mm) - Space Grey Aluminium Case with Black Sport Band')])[2]"));
	iWatch.click();
	String handle = driver.getWindowHandle();
	System.out.println(handle);

Set<String> set = driver.getWindowHandles();
	System.out.println(set);
	for (String p : set) {
		if (!p.equals(handle)) {
			driver.switchTo().window(p);
			
		}
		WebElement cost = driver.findElement(By.xpath("//span[text()='₹50,900.00']"));
		
		String text = cost.getText();
		System.out.println(text);
		
		
	}

			
		}

	}
		
	
	
	


