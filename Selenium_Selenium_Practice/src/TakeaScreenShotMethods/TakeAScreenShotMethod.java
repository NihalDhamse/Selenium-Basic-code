package TakeaScreenShotMethods;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeAScreenShotMethod  {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()+ " "+ driver.getCurrentUrl());
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./Screenshots/image1.png");
		
		
		FileHandler.copy(src,target);
		driver.findElement(By.name("email")).sendKeys("nihal@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Nihal@123");
		
		src=ts.getScreenshotAs(OutputType.FILE);
		target=new File("./Screenshots/fb_form.png");
		
		FileHandler.copy(src, target);
		
		driver.close();
		
	}

}
