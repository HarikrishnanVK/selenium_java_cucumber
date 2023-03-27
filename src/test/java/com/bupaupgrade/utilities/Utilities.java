package com.bupaupgrade.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.ObjectMetaData.Application;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellRange;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.bupaupgrade.basefunctions.InitWebDrivers;

public class Utilities {

	public static WebDriver driver = InitWebDrivers.driver;

	public static File captureScreenshot(String fileName) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File f = new File(System.getProperty("user.dir"), "\\src\\test\\reource\\library\\" + fileName + ".png");
			File temp = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(temp, f);
			return f;
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}


	public static List<String> ReadColumn(List<String> usedcell, String columnName, String SheetName, String FileName) throws Exception {
		usedcell = new ArrayList<String>();
		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resource\\Data\\" + FileName + ".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(fin);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(0);
		//System.out.println(sheet.getPhysicalNumberOfRows());
		//System.out.println(sheet.getLastRowNum());
		//System.out.println(row.getLastCellNum());
		int usedRows = sheet.getPhysicalNumberOfRows();
		int cellnum = 0;
		for (int i = 0; i < row.getLastCellNum(); i++) {
			if (row.getCell(i).getStringCellValue().trim().equals(columnName)) {
				cellnum = row.getCell(i).getColumnIndex();

				for (int j = 1; j <= usedRows; j++) {
					try {
						Row row2 = sheet.getRow(j);
						String stringCellValue = row2.getCell(cellnum).getStringCellValue();
						usedcell.add(stringCellValue);
						//System.out.println("StringCellValue2 is" + " " + stringCellValue);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						break;
					}
				}
				// cellnum2++;

			}
			
		}
		//System.out.println("\n"+usedcell);
		workbook.close();
		return usedcell;
	}
}
