package testngExcel;

import testngExcel.ExcelUtility;


import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class admin {
	private WebDriver driver;
	private ExcelUtility utility;
	
  @Test(dataProvider = "getData")
  public void test(String username, String password) throws Exception {
	  this.driver.findElement(By.id("username")).sendKeys(username);
	  this.driver.findElement(By.id("Password")).sendKeys(password);
	  this.driver.findElement(By.id("submit")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting09\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  this.driver = new ChromeDriver();
	  this.driver.get("D:/Web/admin.html");
  }


  @DataProvider
	public String[][] getData() throws Exception {
	File src=new File("C:\\Users\\itctesting09\\Documents\\Book1.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet5");
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
}
