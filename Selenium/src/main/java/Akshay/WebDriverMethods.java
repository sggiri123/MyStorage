package Akshay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		driver.navigate().refresh();
		driver.navigate().to("https://mail.google.com/mail/u/0/");
		String p = driver.getTitle();
		String s =driver.getCurrentUrl();
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().minimize();
		System.out.println(p+s);
		driver.quit();
		

	}

}
