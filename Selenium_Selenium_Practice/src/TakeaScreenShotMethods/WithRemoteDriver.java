package TakeaScreenShotMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WithRemoteDriver {
	
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()+ " "+ driver.getCurrentUrl());
	
		File src=driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./Screenshots/image2.png");
		
		FileHandler.copy(src,target);
		driver.findElement(By.name("email")).sendKeys("nihal@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Nihal@123");
		
		src=driver.getScreenshotAs(OutputType.FILE);
		target=new File("./Screenshots/fb_form1.png");
		
		FileHandler.copy(src, target);
		
		driver.close();
		
	}

}
