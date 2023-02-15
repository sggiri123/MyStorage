package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDoubleClick {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement element1 = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(element1).perform();
		
		WebElement element2 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(element2).perform();
		
	
		
		

	}

}
