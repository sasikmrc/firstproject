package org.test.today;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YearMonthDay {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dDnYear = driver.findElement(By.xpath("//select[@placeholder='Year']"));
		String text = dDnYear.getText();
		System.out.println(text);
		WebElement dDnMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		String text1 = dDnMonth.getText();
		System.out.println(text1);
		WebElement dDnDay = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		String text2 = dDnDay.getText();
		System.out.println(text2);
		
	}

}
