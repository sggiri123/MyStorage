package Girish;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.6.1");
		driver.manage().window().maximize();
//		driver.navigate().to("https://vtu.ac.in/ph-d-by-research-2/");
//		Thread.sleep(5000);
//		driver.navigate().to("https://www.photopea.com/");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		driver.close();
		String t = driver.getTitle();
		System.out.println(t);
		driver.close();

	}

}