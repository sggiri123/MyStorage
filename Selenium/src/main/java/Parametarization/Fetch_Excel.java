package Parametarization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("/home/poshs/Book.xlsx");
		
		Workbook wb = WorkbookFactory.create(file);
        
		Sheet sheet = wb.getSheet("Sheet1");
		
		//System.out.println(sheet.getPhysicalNumberOfRows());
		
		for (int i =0; i<sheet.getPhysicalNumberOfRows(); i++)
		{
		    String s = sheet.getRow(i).getCell(0).getStringCellValue();
		    System.out.println(s);
		}
		
		for (int i=0; i<sheet.getPhysicalNumberOfRows();i++)
		{
			int a = (int) sheet.getRow(i).getCell(1).getNumericCellValue();
			System.out.println(a);
		}
		
		FileOutputStream file1 = new FileOutputStream("/home/poshs/Book.xlsx");
		for (int i=0; i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row = sheet.getRow(i);
			Cell cell = row.createCell(7);
			cell.setCellValue(sheet.getRow(i).getCell(0).getStringCellValue());
		}
		wb.write(file1);
		file1.close();
	}

}
