package org.test.today;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonthWithoutSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement dDnMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		String text = dDnMonth.getText();
		System.out.println(text);
		
		
	}

}
