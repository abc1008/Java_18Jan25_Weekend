package pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	
	public static void main(String[] args) throws IOException {
		
		
		String path = "D:\\TRAININGS\\Selenium_JAVA_18JAN25_WEEKEND\\Excel File.xlsx";
		
		FileInputStream file = new FileInputStream(path); // handle file on the path
		XSSFWorkbook wb = new XSSFWorkbook(file);  // load/open the file
		XSSFSheet sheet = wb.getSheet("Sheet7");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		
		
		XSSFRow row2 = sheet.getRow(1);
		XSSFCell cell2 = row.getCell(1);
		double numData = cell2.getNumericCellValue();
		System.out.println(numData);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
