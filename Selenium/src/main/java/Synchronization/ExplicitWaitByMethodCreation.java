package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWaitByMethodCreation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		WebElement loginbutton = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		
		email.sendKeys("9665365300");
		password.sendKeys("Shridhar4474#");
		loginbutton.click();
		
		By profilename = By.xpath("//div[text()='Shridhar']");
		isVisible(driver, profilename, 10);
		WebElement profile = driver.findElement(profilename);
		System.out.println(profile.getText());
		
		
		WebElement searchfield = driver.findElement(By.xpath("//input[@class=\"_3704LK\"]"));
		searchfield.sendKeys("laptops");
		searchfield.sendKeys(Keys.ENTER);
		
		By lenovo = By.xpath("(//div[@class=\"_4rR01T\"])[1]");
		isVisible(driver, lenovo, 20).click();
	
	}
	
	public static WebElement isVisible (WebDriver driver, By element, int time) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

}
