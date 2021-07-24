package org.test.today;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DebugClass {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(7000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement dDnlang = driver.findElement(By.id("yearbox"));
//		Select select = new Select(dDnCountries);
		
		Select select = new Select(dDnlang);
		
		List<WebElement> l = select.getOptions();
			
		for (WebElement element : l) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		
	}
		
//		WebElement element = allOptions.get(10);
//		String name = element.getAttribute("value");
//		select.selectByValue(name);
//		System.out.println(name);
		
//		TakesScreenshot screenShot = (TakesScreenshot)driver;
//		File s = screenShot.getScreenshotAs(OutputType.FILE);
//		Thread.sleep(2000);
//		System.out.println(s);
//		Thread.sleep(2000);
//		File d = new File("C:\\Users\\sasik\\Documents\\C1.png");
//		Thread.sleep(2000);
//		FileUtils.copyFile(s,d);
		
		
		
		
//		WebElement linklang = driver.findElement(By.xpath("(//a[@class='gb_f'])[1]"));
//		Thread.sleep(2000);
//		Actions actions = new Actions(driver);
//		actions.contextClick(linklang).perform();
//		
//		Thread.sleep(2000);
//		Robot robot = new Robot();
//		
//		for (int i = 1; i <=6; i++) {
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.keyRelease(KeyEvent.VK_DOWN);
//			}
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//		WebElement txtUserName = driver.findElement(By.id("email"));
//		txtUserName.sendKeys("sasikmrc@gmailcom");
//		Thread.sleep(2000);
//		Actions actions = new Actions(driver);
//		actions.doubleClick(txtUserName).perform();
//		Thread.sleep(4000);
//	
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_X);
//		robot.keyRelease(KeyEvent.VK_X);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
			}
}
