package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	
	public static void main(String[] args) throws IOException {
		
		
		String path = "D:\\TRAININGS\\Selenium_JAVA_18JAN25_WEEKEND\\Excel File.xlsx";
		
		FileInputStream file = new FileInputStream(path); // handle file on the path
		XSSFWorkbook wb = new XSSFWorkbook(file);  // load/open the file
		XSSFSheet sheet = wb.getSheet("Sheet7");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(1);
		
		
		
		FileOutputStream fout = new FileOutputStream(path);
		
		cell.setCellValue(true);
		wb.write(fout);
		
		System.out.println("Competed");
		
		
	}
	
	
	
	
	
	
	
	
	

}
