package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.Select;

public class B_Odonation {
	public String baseurl = "D:/Web/Organ.html";
	public WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.id("First_Name")).sendKeys("Monisha");
		driver.findElement(By.id("Last_Name")).sendKeys("P");
		driver.findElement(By.id("date")).sendKeys("05-04-2001");
		driver.findElement(By.id("Email_Id")).sendKeys("monisha@gmail.com");
		driver.findElement(By.id("Mobile_Number")).sendKeys("2645273645");
		WebElement radio1 = driver.findElement(By.id("Female"));
		radio1.click();
		driver.findElement(By.id("Address")).sendKeys("#2602, kumbarpalya, Bangarpet");
		driver.findElement(By.id("City")).sendKeys("Bangarpet");
		driver.findElement(By.id("Pincode")).sendKeys("563114");
		WebElement drop1 = driver.findElement(By.id("text"));
		Select select1 = new Select(drop1);
		select1.selectByIndex(11);
		WebElement radio2 = driver.findElement(By.id("B+"));
		radio2.click();
		WebElement checkBoxSelect = driver.findElement(By.id("Heart"));
		Boolean isSelect = checkBoxSelect.isSelected();
		if (isSelect == false) {
			checkBoxSelect.click();
		}
		driver.findElement(By.id("adhaar")).sendKeys("098765432345");
		driver.findElement(By.id("submit")).click();
		String expectedTitle = "Message";
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
