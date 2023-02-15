package Imp_Methods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList_SelectClass {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"carselect\"]"));
		
		Select sel = new Select(dropdown);
		
		sel.selectByIndex(1);          //index start from 0.
		Thread.sleep(1000);
		sel.selectByValue("honda");    //by attribute value.
		Thread.sleep(1000);
		sel.selectByVisibleText("BMW"); //by Visible text in the list.
		
		    //comparison of expected list and actual list in drop down 
		
		List <String> expectedlist = new ArrayList<>();
		
		expectedlist.add("BMW");
		expectedlist.add("Benz");
		expectedlist.add("Honda");
		
		List<String> actuallist = new ArrayList<>();
		
		List<WebElement> optionslist = sel.getOptions();
		
		for (WebElement k:optionslist)
		{
			actuallist.add(k.getText());
		}
		
		if(expectedlist.equals(actuallist))
		{
			System.out.println("Test Case is passed. ");
		}
		else
		{
			System.out.println("Test case is failed.");
		}
		
        
	}

}
