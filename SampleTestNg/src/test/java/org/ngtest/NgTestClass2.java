package org.ngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NgTestClass2 {

	public static WebDriver driver;

	@Parameters({ "browserName", "name" })
	@Test
	public void test(String browserName,String name) {

		System.out.println(browserName);
		System.out.println(name);
	}

}
