package pomClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	
	private By profileName = By.xpath("//div[text()='Akshay']");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public boolean checkProfileNameVisible() {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(profileName));
		}catch(Exception e) {
			return false;
		}
		
		return true;
	}

}
