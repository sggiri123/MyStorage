package MouseActions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleSection {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver","/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//option[@value=\"apple\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"orange\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"peach\"]")).click();
		
		act.keyUp(Keys.CONTROL).build().perform();
	}

}
