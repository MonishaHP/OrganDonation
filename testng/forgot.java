package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.*;

public class forgot {
	public String baseurl = "D:/Web/forgot.html";
	public WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.id("username")).sendKeys("Monisha");
		driver.findElement(By.id("Email_Id")).sendKeys("monisha@gmail.com");
		driver.findElement(By.id("number")).sendKeys("2645273645");
		driver.findElement(By.id("Password")).sendKeys("Monithu522");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Monithu522");
		driver.findElement(By.id("submit")).click();
		driver.switchTo().alert();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.findElement(By.id("username")).sendKeys("MonishaP");
		driver.findElement(By.id("Password")).sendKeys("Monithu522");
		driver.findElement(By.id("submit")).click();
		driver.switchTo().alert();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.switchTo().alert();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.switchTo().alert();
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();

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
