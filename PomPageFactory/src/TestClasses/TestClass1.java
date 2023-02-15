package TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.HomePage;
import PomClasses.LoginPage;
import UtilClasses.ScreenShot;

public class TestClass1 {

	public static void main(String[] args) throws IOException, InterruptedException {
       
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		ScreenShot.takescreenshot(driver, "beforelogin");
		
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail();
		lp.enterPassword();
		lp.clickLogin();
	 
		Thread.sleep(10000);
		
		ScreenShot.takescreenshot(driver, "afterlogin");
		
		HomePage hp = new HomePage(driver);

		
		boolean isProfileNameVisible = hp.checkProfieNameVisible();
		if (isProfileNameVisible)
		{
			System.out.println("The testCase is passed.");
		}
		else {
			System.out.println("The testcase is failed.");
		}
		
		hp.searchProduct();

	}

}
