package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_DivisionPopup {

	public static void main(String[] args) {
		
		// This popup have dom structure
		// The popup whose DOM structure will disappear when we close the popup.
		// When this popup disappear, html code related to popup will disappear.
		// This popup can be handled by creating webelemenet.
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).click();
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys("9665365300");
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]")).click();
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]")).sendKeys("Shridhar4474#");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
	
		
	}

}
