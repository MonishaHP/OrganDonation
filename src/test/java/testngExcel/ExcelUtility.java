package testngExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public String getData(String fileName, String Sheet, int rowNumber, int columnNumber) throws Exception {
		Workbook workbook = WorkbookFactory.create(new File(fileName));
		Sheet sheet = workbook.getSheet(Sheet);
		Row row = sheet.getRow(rowNumber);
		return row.getCell(columnNumber).getStringCellValue().trim();
		
	}
	public int getRowCount(String fileName,String Sheet) throws Exception {
		return WorkbookFactory.create(new File(fileName)).getSheet(Sheet).getLastRowNum() + 1;
		
	}
	public int getColumnCount(String fileName,String Sheet) throws Exception {
		return new XSSFWorkbook(new FileInputStream(fileName)).getSheet(Sheet).getRow(0).getLastCellNum();
		
	}

}
