package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Testcase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> actualList = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
		
		List<String> list = new ArrayList<>();
	
		for (int i=0; i<10;i++)
		{
			list.add(actualList.get(i).getText());
		}
		System.out.println(list);
		
		FileInputStream stream = new FileInputStream("/home/poshs/Book1.xlsx");
		
		Workbook wb = WorkbookFactory.create(stream);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		for (int i=0; i<sheet.getPhysicalNumberOfRows(); i++)
		{
			String b = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(b);
		}

		
		
	
	}

}
