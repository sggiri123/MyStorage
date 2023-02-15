package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingActions {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.redbus.in/");
			
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			//js.executeScript("window.scrollBy(0,2000)");   //scroll by pixel
			
			WebElement element = driver.findElement(By.xpath("//span[@class='flagicon icon-IND']"));
			
			//js.executeScript("arguments[0].scrollIntoView(true)", element);
			
			js.executeScript("arguments[0].value='Pune'", driver.findElement(By.xpath("(//input[@type='text'])[1]")));
			
			js.executeScript("arguments[0].value='Mehkar'", driver.findElement(By.xpath("(//input[@type='text'])[2]")));
			
			js.executeScript("arguments[0].click", driver.findElement(By.xpath("(//button[@id='search_btn'])")));
	}

}
