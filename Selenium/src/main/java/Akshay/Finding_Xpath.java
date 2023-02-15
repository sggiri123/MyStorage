package Akshay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("sggiri");   //xpath by attribute name.
		driver.findElement(By.xpath("(//input[contains(@class, 'input')])[2]")).sendKeys("Shridhar"); //xpath by contains attribute.
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/form/div[2]/button")).click(); //absolute xpath.
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.reduceimages.com/");
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();  //xpath by text function.
		driver.findElement(By.xpath("//a[contains(text(), 'Create')]")).click();  //xpath by contains with text.
		driver.findElement(By.xpath("(//form[contains(@class,'sign')]//@id)[7]")).click();  //Relative x path.
		
		

	}

}
