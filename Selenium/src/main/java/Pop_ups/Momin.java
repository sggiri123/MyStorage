package Pop_ups;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Momin {

	public static void main(String[] args) throws InterruptedException {
		
      //This program opens the number of windows and click common WebElement in each window.
		
       System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement element =driver.findElement(By.xpath("//input[@class='_3704LK']"));
		
		element.sendKeys("laptops");
		element.sendKeys(Keys.ENTER);
		
		Thread.sleep(10000);
		
			 driver.findElement(By.xpath("(//div[@class='_3pLy-c row'])[1]")).click();
			 Thread.sleep(10000);
			 
			 Set<String> addresslist = driver.getWindowHandles();
			 List<String> addresslist1 = new ArrayList<>(addresslist);
			 
			 driver.switchTo().window(addresslist1.get(1));
			 
			 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
			 
			 
			 
			 
			 
	}
	}