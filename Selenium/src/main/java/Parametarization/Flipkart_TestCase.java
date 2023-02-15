package Parametarization;

import java.io.FileInputStream;
import java.io.IOException;
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

public class Flipkart_TestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");	
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();	
		List<WebElement> actualElements = driver.findElements(By.xpath("//div[@class='eFQ30H']"));
		List<String> actualElementText = new ArrayList<>();
		for (int i=0; i<actualElements.size(); i++)
		{
			actualElementText.add(actualElements.get(i).getText());
		}
		System.out.println(actualElementText);	
		FileInputStream expectedList = new FileInputStream("/home/poshs/Book.xlsx");	
		Workbook wb = WorkbookFactory.create(expectedList);	
		Sheet sheet = wb.getSheet("Sheet2");
		
		List<String> expectedElementText = new ArrayList<>();
		for(int i=0; i<sheet.getPhysicalNumberOfRows();i++)
		{
			expectedElementText.add(sheet.getRow(i).getCell(0).getStringCellValue());
		}
		System.out.println(expectedElementText);
		for(int i=0; i<expectedElementText.size();i++)
		{
			for (int j=0; j<actualElementText.size();j++)
			{
				if (i==j)
				{
					System.out.println("Test case is passed");		
				}
				
			}
			
		}

	}

}
