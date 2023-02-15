package Girish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			String title =driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//input[@maxlength=\"2048\"]")).click(); //xpath by attribute
			
			driver.navigate().to("https://www.facebook.com/");   
			driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click(); //xpath by text
			
			driver.get("https://openlibrary.org/");
			driver.findElement(By.xpath("(// a[text()='My Books'])[1]")).click(); //xpath by text //by index
			driver.close();
			
			
	

			
			
	
	}

}
