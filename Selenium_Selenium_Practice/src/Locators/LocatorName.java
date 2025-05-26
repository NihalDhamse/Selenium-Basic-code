package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorName {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    WebElement emailElement=driver.findElement(By.name("email"));
	    WebElement passElement=driver.findElement(By.name("pass"));
	    WebElement loginElement=driver.findElement(By.name("login"));
	    
	    System.out.println(emailElement.getText());
	    System.out.println(emailElement.getAttribute("placeholder"));
	    System.out.println(passElement.getText());
	    System.out.println(passElement.getAttribute("placeholder"));
	    
	    emailElement.sendKeys("nihal@gmail.com");
	    passElement.sendKeys("Nihal");
	    System.out.println(driver.getTitle());
	    loginElement.click();
	    
	    System.out.println(driver.getTitle());
	    
	    driver.close();
	}

}
