package Imp_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_Displayed_Enabled {
		
		public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
			WebDriver driver = new ChromeDriver();	
			driver.get("https://courses.letskodeit.com/practice");
			
			                     //isSelected() ---> true or false
			
			WebElement bmw = driver.findElement(By.xpath("//input[@id = 'bmwradio']"));
			bmw.click();
			System.out.println(bmw.isSelected());
			Thread.sleep(1000);
			WebElement benz = driver.findElement(By.xpath("//input[@id = 'benzradio']"));
			System.out.println(benz.isSelected());
			
			                       //isEnabled() ---> true or false
			
			WebElement inputElement = driver.findElement(By.xpath("//input[@id = 'enabled-example-input']"));	
			driver.findElement(By.xpath("//input[@id = 'disabled-button']")).click();
			if (inputElement.isEnabled())
			{
				inputElement.sendKeys("Shridhar");
			}
			else 
			{
				System.out.println("Input field is disabled.");
			}
			
			                         //isDisplayed() ----> true or false
			
			WebElement displayElement = driver.findElement(By.xpath("//input[@id = 'displayed-text']"));
			
			driver.findElement(By.xpath("//input[@id = 'hide-textbox']")).click();
			
			System.out.println(displayElement.isDisplayed());
			
			
		
	}

}
