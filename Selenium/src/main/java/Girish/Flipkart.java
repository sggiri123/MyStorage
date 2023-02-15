package Girish;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).click();
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys("9665365300");
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]")).click();
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]")).sendKeys("Shridhar4474#");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("laptops");
		driver.findElement(By.xpath("//button[@type=\"Search\"]")).click();
	
	}

}
