package org.test.today;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionTextMonth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement dDnMonth = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select select = new Select(dDnMonth);
		List<WebElement> l = select.getOptions();
//		System.out.println(l.size());
		
//		int size=(l.size()/2);
	
		
		
		for (int i = l.size()-1; i <l.size(); i++) {
			System.out.println(l.get(i).getText());
			
			
			
		}
		
		
	}

}

