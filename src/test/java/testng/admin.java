package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.Select;

public class admin {
	public String baseurl = "D:/Web/admin.html";
	public WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.id("username")).sendKeys("Team1");
		driver.findElement(By.id("Password")).sendKeys("Team1@1");
		driver.findElement(By.id("submit")).click();
		driver.switchTo().alert();
		Alert alert1 =driver.switchTo().alert();
	    alert1.accept();
	    driver.switchTo().alert();
	    Alert alert2 =driver.switchTo().alert();
	    alert2.accept();
		String expectedTitle = "Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@BeforeTest
	public void beforeTest() {
		String path1 = "C:\\Users\\itctesting09\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver = new ChromeDriver();
		driver.get(baseurl);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
