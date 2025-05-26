package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorParticalLinkText {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().fullscreen();
		
		WebElement linkText=driver.findElement(By.partialLinkText("About"));
		System.out.println(linkText.getText());
		
		driver.close();
	}
	
	

}
