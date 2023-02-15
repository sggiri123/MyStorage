package Parametarization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");	
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://demoqa.com/nestedframes");
		
		WebElement mainpageText = driver.findElement(By.xpath("//div[contains(text(), 'Sample Nested')]"));
		
		System.out.println(mainpageText.getText());
		
		WebElement parentframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		
		driver.switchTo().frame(parentframe);   //switching to iframe by webelement.
		
		System.out.println(driver.findElement(By.xpath("//body[1]")).getText());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));   //switching to iframe by its index.
		
		System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
		
//		driver.switchTo().parentFrame();
//		
//		System.out.println(driver.findElement(By.xpath("//body[1]")).getText());
//		
//		driver.switchTo().parentFrame();
//		
//		System.out.println(mainpageText.getText());
		
		driver.switchTo().defaultContent();
		
		System.out.println(mainpageText.getText());
	
		
	}

}
