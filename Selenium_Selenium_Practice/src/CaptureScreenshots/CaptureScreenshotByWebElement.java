package CaptureScreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotByWebElement {
	public static void main(String[] args) throws IOException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement googleLogo = driver.findElement(By.xpath("//a[text()='Gmail']"));
		File src = googleLogo.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshots/screenshot.png");
		FileHandler.copy(src, target);
		driver.close();
}
}