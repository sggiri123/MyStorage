package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;

	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement loginbutton;
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void enterEmail() {
		email.sendKeys("9665365300");
	}
	public void enterPassword() {
		password.sendKeys("Shridhar4474#");
	}
	public void clickLogin() {
		loginbutton.click();
	}
	

}
