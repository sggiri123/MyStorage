package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
			
			driver.manage().window().maximize();
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class, 'demo-frame lazyloaded')]")));
			
			WebElement source = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
			WebElement destination = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
			
			Actions act = new Actions(driver);
		
			//act.dragAndDrop(source, destination).perform();
			
			act.clickAndHold(source).moveToElement(destination).release().build().perform();
			
			
			
	}

}
