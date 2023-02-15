package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.HomePage;
import pomClasses.LoginPage;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		LoginPage lp = new LoginPage(driver);
		lp.enterEmailID();
		lp.enterPassword();
		lp.clickOnLoginBtn();
		
		Thread.sleep(10000);
		

		HomePage hp = new HomePage(driver);
		
		boolean isProfileNameVisible = hp.checkProfileNameVisible();
		
		if(isProfileNameVisible) {
			System.out.println("Test case is passed");
		}else {
			System.out.println("Test is failed");
		}
		
	}
	
	
	
	

}
