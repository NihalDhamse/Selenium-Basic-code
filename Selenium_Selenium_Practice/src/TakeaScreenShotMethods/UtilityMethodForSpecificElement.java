package TakeaScreenShotMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityMethodForSpecificElement {

	public static void main(String[] args) throws WebDriverException, IOException {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()+ " "+ driver.getCurrentUrl());

		captureScreenshots(driver, "fb_login1");
		
		WebElement element=driver.findElement(By.xpath("//div[@class='_8esk']/div[@class='_8esl']"));
		WebElement element1=driver.findElement(By.xpath("//div[@class='_8esk']/div[@class='_8esn']"));
		
		captureScreenshots(driver, "fb_login_form1");
		
		driver.close();
	}
	
	static void captureScreenshots(WebDriver driver, String screenshotname) throws WebDriverException, IOException {
		FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),
		    new File("./Screenshots/"+screenshotname+".png"));
	}

}
