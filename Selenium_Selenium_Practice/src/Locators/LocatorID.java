package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorID {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().fullscreen();
		
		WebElement emailText=driver.findElement(By.id("email"));
		WebElement passText=driver.findElement(By.id("pass"));
		WebElement loginBtn=driver.findElement(By.name("login"));
		
		System.out.println(emailText.getText());
		System.out.println(passText.getText());
		
		
		emailText.sendKeys("Nihal@gmail.com");
		passText.sendKeys("Nihal@123");
		//loginBtn.click();
		
		
		driver.close();
		
	}

}
