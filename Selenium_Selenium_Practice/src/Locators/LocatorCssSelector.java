package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCssSelector {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement emailTxt=driver.findElement(By.cssSelector("#email"));
		WebElement passTxt=driver.findElement(By.cssSelector(".pass"));
		
		System.out.println(emailTxt.getText());
		System.out.println(passTxt.getText());
		
		emailTxt.sendKeys("Nihal@gmail.com");
		passTxt.sendKeys("Nihal@123");
		
		driver.close();
	}

}
