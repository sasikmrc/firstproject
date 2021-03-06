package org.test;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.utility.LibGlobalCommon;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSuits {
	static WebDriver driver;
	static LibGlobalCommon z;

	@BeforeClass
	public static void beforeclass() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void afterclass() {

		driver.quit();
	}

	@Before
	public void before() {
		Date date = new Date();
		System.out.println("start time " + date);
	}

	@After
	public void after() {
		Date date = new Date();
		System.out.println("end time " + date);
	}

	@Test
	public void Test1() throws InterruptedException, IOException {
		z = new LibGlobalCommon();
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(z.excelRead(1, 0));
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(z.excelRead(1, 1));
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		// TakeScreenShot screenShot1 = (TakeScreenShot)driver;
		Thread.sleep(5000);
	}

	@Test
	public void Test2() throws InterruptedException, IOException {
		WebElement dpLocation = driver.findElement(By.id("location"));
		Select select = new Select(dpLocation);
		select.selectByVisibleText(z.excelRead(1, 2));
		WebElement dphotels = driver.findElement(By.id("hotels"));
		Select select1 = new Select(dphotels);
		select1.selectByVisibleText(z.excelRead(1, 3));
		WebElement dproomtype = driver.findElement(By.id("room_type"));
		Select select2 = new Select(dproomtype);
		select2.selectByVisibleText(z.excelRead(1, 4));
		WebElement btnClick1 = driver.findElement(By.id("Submit"));
		btnClick1.click();
		Thread.sleep(5000);
	}

	@Test
	public void Test3() throws InterruptedException {
		WebElement rdbtn = driver.findElement(By.name("radiobutton_0"));
		rdbtn.click();
		WebElement btn = driver.findElement(By.name("continue"));
		btn.click();
		Thread.sleep(5000);
	}

	@Test
	public void Test4() throws InterruptedException, IOException {
		WebElement txtFirstName = driver.findElement(By.name("first_name"));
		txtFirstName.sendKeys(z.excelRead(1, 6));
		WebElement txtlastName = driver.findElement(By.name("last_name"));
		txtlastName.sendKeys(z.excelRead(1, 7));
		WebElement txtAddress = driver.findElement(By.name("address"));
		txtAddress.sendKeys(z.excelRead(1, 8));
		WebElement numCcNo = driver.findElement(By.name("cc_num"));
		numCcNo.sendKeys(z.excelRead(1, 9));

		WebElement dpcctype = driver.findElement(By.id("cc_type"));
		Select select2 = new Select(dpcctype);
		select2.selectByVisibleText(z.excelRead(1, 10));

		WebElement dpccexpmm = driver.findElement(By.id("cc_exp_month"));
		Select select3 = new Select(dpccexpmm);
		select3.selectByVisibleText(z.excelRead(1, 11));

		WebElement dpccexpyy = driver.findElement(By.id("cc_exp_year"));
		Select select4 = new Select(dpccexpyy);
		select4.selectByVisibleText(z.excelRead(1, 12));

		WebElement txtcvv = driver.findElement(By.name("cc_cvv"));
		txtcvv.sendKeys(z.excelRead(1, 13));

		WebElement btn = driver.findElement(By.name("book_now"));
		btn.click();

	}

	@Test
	public void Test5() throws InterruptedException {
		Thread.sleep(7000);
		WebElement element = driver.findElement(By.id("order_no"));
		String name1 = element.getAttribute("value");
		System.out.println(name1);

	}

}
