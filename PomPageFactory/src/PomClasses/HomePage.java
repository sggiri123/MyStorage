package PomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.Util;

public class HomePage extends Util {
	
	WebDriver driver;
    @FindBy (xpath= "//input[@class='_3704LK']")
    private WebElement searchfield;
  
    @FindBy (xpath="//div[text()='Shridhar']")
    private WebElement profileName;
    
    public HomePage (WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    	this.driver=driver;
    }
     
    public boolean checkProfieNameVisible() {
    	
    	try {
    		waitTillElementPresent(driver, By.xpath("//div[text()='Shridhar']"), 50);
    	}
    	catch (Exception e) {
    		return false;
    	}
    	return true;	
    }

    public void searchProduct() {
    	searchfield.sendKeys("Oppo Mobiles");
    	driver.navigate().refresh();
    	waitTillElementPresent(driver, By.xpath("//input[@class='_3704LK']"),10);
    	searchfield.sendKeys("Oppo Mobiles");
    	
    }

}
