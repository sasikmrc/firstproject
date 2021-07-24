package org.test.today;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AttributeOptionDays {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dDnMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select select = new Select(dDnMonth);
		List<WebElement> allSelectedOptions = select.getOptions();
		for (WebElement webElement : allSelectedOptions) {
			String attribute = webElement.getAttribute("value");
			System.out.println(attribute);
			
		}
	}

}
