package Imp_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_SendKeys_getText_getAtrribute {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.findElement(By.xpath("//input[@id = 'bmwradio']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'benzradio']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'hondaradio']")).click();
		
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("Shridhar");
		
        WebElement bmw = driver.findElement(By.xpath("(//label[@for = 'bmw'])[1]"));
        System.out.println(bmw.getText());
        WebElement radiobuttonExample = driver.findElement(By.xpath("//legend[text() = 'Radio Button Example']"));
        System.out.println(radiobuttonExample.getText());
        
        WebElement button = driver.findElement(By.xpath("(//label[@for='benz'])[1]"));
        System.out.println(button.getAttribute("for"));
	}
	}
    
