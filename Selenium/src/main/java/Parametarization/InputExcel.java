package Parametarization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InputExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		List<String> list = new ArrayList<>();
		
		list.add("Shridhar");
		list.add("Mangesh");
		list.add("Shankar");
		list.add("Narendra");
		
        FileInputStream file = new FileInputStream("/home/poshs/Book2.xlsx");
		
		Workbook wb = WorkbookFactory.create(file);
        
		Sheet sheet = wb.getSheet("Sheet1");
		
		System.out.println(list.get(0));
		System.out.println(list.size());
		
		FileOutputStream file1 = new FileOutputStream("/home/poshs/Book2.xlsx");
		
		for (int i=0; i<list.size(); i++)
		{
			Row row = sheet.getRow(i);
			Cell cell = row.createCell(1);
			cell.setCellValue(list.get(i));
		}
		wb.write(file1);
		file1.close();
		
		
	}

}
