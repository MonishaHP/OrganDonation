package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.Select;

public class organ {
	public WebDriver driver;

	@Test(priority=2)
	public void login() throws Exception {
		driver.get("D:/Web/login1.html");
		driver.findElement(By.id("username")).sendKeys("MonishaP");
//		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Monithu522");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		driver.switchTo().alert();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		driver.switchTo().alert();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(1000);
		driver.switchTo().alert();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		Thread.sleep(1000);
		String expectedTitle = "Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority=1)
	public void register() throws Exception {
		driver.get("D:/Web/register1.html");
		driver.findElement(By.id("text")).sendKeys("Monisha P");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("Monisha");
		Thread.sleep(1000);
		driver.findElement(By.id("Email_Id")).sendKeys("monisha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("number")).sendKeys("2645273645");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Monithu522");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Monithu522");
		Thread.sleep(1000);
		WebElement radio1 = driver.findElement(By.id("female"));
		radio1.click();
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		driver.switchTo().alert();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		String expectedTitle = "Login Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority=2)
	public void forgot() throws Exception {
		driver.get("D:/Web/forgot.html");
		driver.findElement(By.id("username")).sendKeys("Monisha");
		Thread.sleep(1000);
		driver.findElement(By.id("Email_Id")).sendKeys("monisha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("number")).sendKeys("2645273645");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Monithu522");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Monithu522");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.switchTo().alert();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		String expectedTitle = "Login Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority=3)
	public void homepage() throws Exception {
		driver.get("D:/Web/homepage.html");
		Thread.sleep(1000);
		driver.findElement(By.id("blood & orgran")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("First_Name")).sendKeys("Monisha");
		Thread.sleep(1000);
		driver.findElement(By.id("Last_Name")).sendKeys("P");
		Thread.sleep(1000);
		driver.findElement(By.id("date")).sendKeys("05-04-2001");
		Thread.sleep(1000);
		driver.findElement(By.id("Email_Id")).sendKeys("monisha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Mobile_Number")).sendKeys("2645273645");
		Thread.sleep(1000);
		WebElement radio1 = driver.findElement(By.id("Female"));
		radio1.click();
		Thread.sleep(1000);
		driver.findElement(By.id("Address")).sendKeys("#2602, kumbarpalya, Bangarpet");
		Thread.sleep(1000);
		driver.findElement(By.id("City")).sendKeys("Bangarpet");
		Thread.sleep(1000);
		driver.findElement(By.id("Pincode")).sendKeys("563114");
		Thread.sleep(1000);
		WebElement drop1 = driver.findElement(By.id("text"));
		Select select1 = new Select(drop1);
		select1.selectByIndex(11);
		Thread.sleep(1000);
		WebElement radio2 = driver.findElement(By.id("B+"));
		radio2.click();
		Thread.sleep(1000);
		WebElement checkBoxSelect = driver.findElement(By.id("Heart"));
		Boolean isSelect = checkBoxSelect.isSelected();
		if (isSelect == false) {
			checkBoxSelect.click();
		}
		Thread.sleep(1000);
		driver.findElement(By.id("adhaar")).sendKeys("098765432345");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button")).click();
		Thread.sleep(1000);
//		driver.findElement(By.id("about")).click();
//		driver.findElement(By.id("btn")).click();
		String expectedTitle = "Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test(priority=4)
	public void about() throws Exception{
		driver.get("D:/Web/homepage.html");
		Thread.sleep(1000);
		driver.findElement(By.id("about")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn")).click();
		Thread.sleep(1000);
		String expectedTitle = "Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test(priority=5)
	public void admin() throws Exception {
		driver.get("D:/Web/admin.html");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("Team1");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Team1@1");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.switchTo().alert();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(1000);
		driver.switchTo().alert();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

	}

	@BeforeTest
	public void beforeTest() {
		String path1 = "C:\\Users\\itctesting09\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
