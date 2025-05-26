package CaptureScreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotsChrome {
	public static void main(String[] args) throws WebDriverException, IOException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		FileHandler.copy((driver.getScreenshotAs(OutputType.FILE)), new File("./screenshots/google.png"));
		System.out.println("capture screenshot");
		driver.close();
	}

}
