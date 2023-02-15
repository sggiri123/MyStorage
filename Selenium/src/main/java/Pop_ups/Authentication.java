package Pop_ups;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) throws InterruptedException {
		//This popup comes before website opens
		//To handle this popup, we need to send userid and password

//Normal Authentication:
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
//		String url ="https://the-internet.herokuapp.com/basic_auth";
//		String userName = "admin";
//		String password ="admin";
//		String newurl = "https://"+userName + ":"+ password+ "@"+"the-internet.herokuapp.com/basic_auth";
//		driver.get(newurl);
//		driver.manage().window().maximize();
		
		
// Third Party Authentication:
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']")));
		driver.findElement(By.xpath("//span[text()='Sign in with Google]")).click();
		Thread.sleep(2000);
		List<String> addresses = new ArrayList<>(driver.getWindowHandles());
		
		 driver.switchTo().window(addresses.get(1));
		
		
		
		
		
		
		
		
	}

}
