package UtilClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void takescreenshot(WebDriver driver, String filename) throws IOException {
		
		TakesScreenshot shot = (TakesScreenshot)driver;
		
		File source = shot.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("/home/poshs/Pictures/ "+ filename + ".png");
		
		FileHandler.copy(source, destination);
		
		

	}

}
