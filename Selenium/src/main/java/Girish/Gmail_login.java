package Girish;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gmail_login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-921842249%3A1661763788503775&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmXV7Nvcg5ckkhQfOIbTmnc_QxDDzoSQDWOqyWzI-gIg5hdW-2IHIhIlpUvHcLYWDt9Okye7ag");
		
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("vivek.projects@poshsmetal.com");
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
		driver.findElement(By.xpath("//input[ @type ='password']")).sendKeys("poshs@567");
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
}
}
