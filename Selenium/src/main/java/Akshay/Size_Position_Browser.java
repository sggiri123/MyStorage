package Akshay;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_Position_Browser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com/"); 
		
		driver.manage().window().maximize();

		int x = driver.manage().window().getSize().width;
		int y = driver.manage().window().getSize().height;
		
		int a = driver.manage().window().getPosition().getX();
		int b = driver.manage().window().getPosition().getY();
		
		System.out.println("The size of the browser is : "+ x +" and "+ y);
		System.out.println("The position of the browser is : "+ a +" and "+ b);
		
		Dimension p = new Dimension(300,500);
	    driver.manage().window().setSize(p);     //for setting new size to browser.
 
	    Point s = new Point(300,500);
		driver.manage().window().setPosition(s); //for setting new position of browser.
		
	}

}
