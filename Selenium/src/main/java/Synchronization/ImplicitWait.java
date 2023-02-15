package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys("9665365300");
		
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]")).sendKeys("Shridhar4474#");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		WebElement inputfield = driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]"));
		inputfield.sendKeys("laptops");
		inputfield.sendKeys(Keys.ENTER);

		
	}

}
