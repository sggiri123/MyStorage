package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HowTakeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		takeScreenshot (driver, "beforelogin", 2);
		loginMethod(driver);
		takeScreenshot (driver, "afterlogin", 2);
		
	}
	
	public static void loginMethod (WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys("9665365300");
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]")).sendKeys("Shridhar4474#");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		Thread.sleep(2000);
	}
	
	public static void takeScreenshot(WebDriver driver, String Filename, int printcount) throws IOException
	{
		for (int i = 1; i<=printcount; i++) CD 
		{
			TakesScreenshot k = ((TakesScreenshot)driver);
			File source = k.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("/home/poshs/" + Filename +".png");
			FileHandler.copy(source, destination);
		}
		
		
	}

}
