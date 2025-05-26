package TakeaScreenShotMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PerticularElementScreenShotMethod {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()+ " "+ driver.getCurrentUrl());
		
		WebElement element=driver.findElement(By.xpath("//div[@class='_8esk']/div[@class='_8esl']"));
		WebElement element1=driver.findElement(By.xpath("//div[@class='_8esk']/div[@class='_8esn']"));
		
		File src=element.getScreenshotAs(OutputType.FILE);
		File target=new File("./Screenshots/myvisibleele1.png");
		
		FileHandler.copy(src, target);
		
		src=element1.getScreenshotAs(OutputType.FILE);
		target=new File("./Screenshots/myvisible3.png");
		
		FileHandler.copy(src, target);
		
		WebElement emailText=driver.findElement(By.name("email"));
		emailText.sendKeys("Nihal@123");
		
		src=emailText.getScreenshotAs(OutputType.FILE);
		target=new File("./Screenshots/email.png");
		
		FileHandler.copy(src, target);
		
		driver.close();
		
		
	}
}
