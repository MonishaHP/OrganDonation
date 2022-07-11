package testngExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import testngExcel.ExcelUtility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import com.google.common.base.Function;

public class forgotReader {
	private WebDriver driver;
	private ExcelUtility utility;
	// private Wait<WebDriver> wait;

	@DataProvider
	public String[][] getData() throws Exception {
	File src=new File("C:\\Users\\itctesting09\\Documents\\Book1.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet2");
	int Rows=sheet.getPhysicalNumberOfRows();
	int cols=sheet.getRow(0).getLastCellNum();

	String[][] data=new String[Rows-1][cols];
	for(int i=0;i<Rows-1;i++)
	{
	for(int j=0;j<cols;j++)
	{
	DataFormatter df=new DataFormatter();
	data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));

	}
	System.out.println();
	}
	wb.close();
	fis.close();
	return data;

	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\itctesting09\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		this.driver = new ChromeDriver();

		this.driver.get("D:/Web/forgot.html");
        Thread.sleep(500);

	}
	

	@Test(dataProvider = "getData")
	public void test(String username, String email, String new_pwd, String cnf_pwd) throws Exception {

		this.driver.findElement(By.id("username")).sendKeys(username);

		this.driver.findElement(By.id("Email_Id")).sendKeys(email);
		this.driver.findElement(By.id("Password")).sendKeys(new_pwd);
		this.driver.findElement(By.id("ConfirmPassword")).sendKeys(cnf_pwd);
		this.driver.findElement(By.id("submit")).click();
		Thread.sleep(500);

	}

}
