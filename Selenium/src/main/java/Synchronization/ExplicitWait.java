package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver","/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys("9665365300");
			
			driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]")).sendKeys("Shridhar4474#");
			driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
			
			By element = By.xpath("//div[text()='Shridhar']");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
			
			System.out.println(ele.getText());
	}

}
