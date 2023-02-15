package Pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		//This popup is not a part of website. It does not have any dom structure.
		//To handle this popup we need to shift our selenium focus from main page to alert popup.
		//Run 1 by 1 alerts
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
//		driver.findElement(By.id("timerAlertButton")).click();
//		Thread.sleep(10000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		WebElement prompt = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
		
		Actions act = new Actions(driver);
		
		act.scrollByAmount(0, 500).perform();
		prompt.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Shridhar");
        alert.accept();
	
	}

}
