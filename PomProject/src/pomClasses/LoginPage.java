package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	private By emailId = By.xpath("(//input[@type='text'])[2]");
	
	private By password = By.xpath("//input[@type='password']");
	
	private By loginBtn = By.xpath("(//button[@type='submit'])[2]");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void enterEmailID() {
		driver.findElement(emailId).sendKeys("akshaynarhare1541@gmail.com");
	}
	
	public void enterPassword() {
		driver.findElement(password).sendKeys("Akshay123");
	}
	
	public void clickOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	

}
