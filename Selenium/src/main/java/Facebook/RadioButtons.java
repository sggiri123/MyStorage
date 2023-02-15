package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement signup = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		signup.click();
		
		Thread.sleep(10000);
		
        WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		radiobutton.click();
		
		Thread.sleep(2000);
		
		if (radiobutton.isSelected())
		{
			System.out.println("Radio Button is selected");
		}
		else 
		{
			System.out.println("Radio Button is not selected");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
